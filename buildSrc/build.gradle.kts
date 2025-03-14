// @see https://docs.gradle.org/current/userguide/implementing_gradle_plugins_precompiled.html
// @see https://docs.gradle.org/current/samples/sample_convention_plugins.html#compiling_convention_plugins
plugins {
    id("java-gradle-plugin")
    kotlin("jvm") version "2.1.10"
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}
