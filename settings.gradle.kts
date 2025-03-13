pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

plugins {
    id("com.gradle.develocity") version "3.19.2"
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}

rootProject.name = "gradle-convention-plugin-example"

settings.gradle.projectsLoaded {
    develocity {
        projectId.set("codeprimate.examples.gradle.convention-plugin")
        buildScan {
            capture {
                uploadInBackground.set(true)
            }
        }
    }
}

include("app")
