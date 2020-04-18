tasks.register<JavaExec>("longTest") {
	main = "com.lyeeedar.headless.LongTest"
	classpath = project.the<SourceSetContainer>()["main"].runtimeClasspath
	standardInput = System.`in`
	workingDir = file("../assets")
}

tasks.register<JavaExec>("replayCrashedLevel") {
	main = "com.lyeeedar.headless.CrashedLevelReplayer"
	classpath = project.the<SourceSetContainer>()["main"].runtimeClasspath
	standardInput = System.`in`
	workingDir = file("../assets")
}

tasks.register<JavaExec>("bruteForceTestLevels") {
	main = "com.lyeeedar.headless.BruteForceLevelTester"
	classpath = project.the<SourceSetContainer>()["main"].runtimeClasspath
	standardInput = System.`in`
	workingDir = file("../assets")
}

tasks.register<JavaExec>("gameLoopTest") {
	main = "com.lyeeedar.headless.GameLoopTest"
	classpath = project.the<SourceSetContainer>()["main"].runtimeClasspath
	standardInput = System.`in`
	workingDir = file("../assets")
}