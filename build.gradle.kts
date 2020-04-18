
buildscript {
	rootProject.apply(from = rootProject.file("engine/versions.gradle.kts"))

	repositories {
		gradlePluginPortal()
		google()
	}

	dependencies {
		"classpath"("com.android.tools.build:gradle:" + extra["androidToolsVersion"] as String)
		"classpath"(kotlin("gradle-plugin", extra["kotlinVersion"] as String))
		"classpath"("com.lyeeedar.gradle-plugins:gradle-plugins")
	}
}

plugins {
	base
}

allprojects {
	repositories {
		jcenter()
		google()
	}
}