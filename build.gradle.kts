val appVersionCode by extra(1)
val appVersion by extra("1.0.0")

val kotlinVersion by extra("1.3.71")
val gdxVersion by extra("1.9.10")
val ktxVersion by extra("1.9.10-b5")
val junitVersion by extra("4.12")
val squidlibVersion by extra("3.0.0-b10")
val kryoVersion by extra("5.0.0-RC5")

buildscript {
	//val kotlinVersion: String by project
	val kotlinVersion: String by project
	throw kotlin.Exception(kotlinVersion)

    repositories {
        gradlePluginPortal()
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.4.1")
        classpath(kotlin("gradle-plugin", kotlinVersion))
		classpath("com.lyeeedar.gradle-plugins:gradle-plugins")
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
