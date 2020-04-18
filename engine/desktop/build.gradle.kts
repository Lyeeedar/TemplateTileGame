plugins {
    kotlin("jvm")
}

sourceSets {
	main {
		java.srcDirs("src/", "../../game/desktop/src/")
		resources.srcDirs("../assets")
	}
}

dependencies {
    val gdxVersion: String by project

    implementation(project(":core"))

    implementation(kotlin("stdlib"))

    implementation("com.badlogicgames.gdx:gdx-backend-lwjgl3:$gdxVersion")
    implementation("com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-desktop")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

tasks.register<Jar>("dist") {
    from(files(sourceSets.main.get().output.classesDirs))
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    from(file("../assets"))

    manifest {
        attributes["Main-Class"] = "com.example.desktop.DesktopLauncher"
    }
}

tasks.register<JavaExec>("run") {
	main = "com.example.desktop.DesktopLauncher"
	classpath = sourceSets.main.get().runtimeClasspath
	standardInput = System.`in`
	workingDir = file("../assets")
	isIgnoreExitValue = true

	if ("mac" in System.getProperty("os.name").toLowerCase()) {
		jvmArgs("-XstartOnFirstThread")
	}
}

project.apply {
	from("../../game/desktop/build.gradle.kts")
}