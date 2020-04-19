
buildscript {
	rootProject.apply(from = rootProject.file("engine/versions.gradle.kts"))

	repositories {
		gradlePluginPortal()
		google()
		mavenCentral()
		jcenter()
		maven("https://oss.sonatype.org/content/repositories/snapshots/")
		maven("https://maven.fabric.io/public")
	}

	dependencies {
		classpath("com.android.tools.build:gradle:" + extra["androidToolsVersion"] as String)

		classpath(kotlin("gradle-plugin", extra["kotlinVersion"] as String))

		classpath("com.lyeeedar.gradle-plugins:gradle-plugins")

		classpath("com.google.gms:google-services:4.2.0")
		classpath("io.fabric.tools:gradle:1.31.2")
		classpath("com.google.firebase:perf-plugin:1.3.1")
	}
}

plugins {
	base
}

allprojects {
	repositories {
		jcenter()
		google()
		mavenCentral()
		maven("https://oss.sonatype.org/content/repositories/snapshots/")
		maven("https://oss.sonatype.org/content/repositories/releases/")
	}
}