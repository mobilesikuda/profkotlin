plugins {
    kotlin("jvm") version "1.8.0"
    application
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
