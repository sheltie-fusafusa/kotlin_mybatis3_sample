import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.20"
    application
}

group = "me"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    // https://mvnrepository.com/artifact/org.mybatis/mybatis
    implementation("org.mybatis:mybatis:3.5.11")
    // https://mvnrepository.com/artifact/mysql/mysql-connector-java
    implementation("mysql:mysql-connector-java:8.0.32")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}