
val kotlin_version: String by project
val logback_version: String by project
val koinVersion : String by project
val daprVersion : String by project
val ktor_version: String by project
val arrowFxVersion : String by project

plugins {
    kotlin("jvm") version "2.0.0"
    id("io.ktor.plugin") version "2.3.12"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.0.0"
}

group = "example.com"
version = "0.0.1"

application {
    mainClass.set("example.com.ApplicationKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm")
    implementation("io.ktor:ktor-server-host-common-jvm")
    implementation("io.ktor:ktor-server-status-pages-jvm")
    implementation("io.ktor:ktor-server-content-negotiation-jvm")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm")
    implementation("io.ktor:ktor-server-netty-jvm")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    implementation("io.ktor:ktor-server-config-yaml")
    testImplementation("io.ktor:ktor-server-tests-jvm")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")

    implementation("io.ktor:ktor-server-cio:$ktor_version") // For server CIO engine
    implementation("org.litote.kmongo:kmongo-coroutine:4.6.0")  // For MongoDB
    implementation("io.insert-koin:koin-ktor:$koinVersion")  //For Koin
    implementation("io.dapr:dapr-sdk:$daprVersion")  // For Dapr
    implementation("io.ktor:ktor-serialization-gson-jvm:$ktor_version")
    implementation("io.ktor:ktor-client-cio:$ktor_version") // For Http-Client CIO engine
    implementation("io.ktor:ktor-client-content-negotiation:$ktor_version")
    testImplementation("io.mockk:mockk:1.12.0") //For MockK
    implementation("io.github.microutils:kotlin-logging-jvm:3.0.5") // For KotlinLogging
    implementation("io.arrow-kt:arrow-fx-coroutines:$arrowFxVersion") //For Either
}
