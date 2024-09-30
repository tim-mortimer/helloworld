plugins {
    kotlin("jvm") version "2.0.20"
}

group = "uk.co.kiteframe.helloworld"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.http4k:http4k-bom:5.32.1.0"))
    implementation("org.http4k:http4k-core")
    implementation("org.http4k:http4k-server-undertow")
    implementation("io.arrow-kt:arrow-core:1.2.4")
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.1")
    testImplementation("io.kotest:kotest-assertions-core:5.9.0")
}

tasks.test {
    useJUnitPlatform()
}