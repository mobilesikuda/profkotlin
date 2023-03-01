plugins {
    kotlin("jvm") version "1.8.0"
}

allprojects{
    repositories {
        google()
        mavenCentral()
        maven( url = "https://jitpack.io")
    }
}

subprojects{
    group = "ru.sikuda"
    version = "1.0-SNAPSHOT"

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>{
        kotlinOptions.jvmTarget = "11"
    }
}
