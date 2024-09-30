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
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}