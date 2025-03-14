plugins {
    kotlin("jvm") version "2.1.10"
    antlr
    kotlin("plugin.spring") version "1.9.25"
    id("org.springframework.boot") version "3.4.3"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // For parsing
    antlr("org.antlr:antlr4:4.5")
    // For runtime library
    implementation("org.antlr:antlr4-runtime:4.11.1") // ✅ Add ANTLR runtime library

    // If using Spring Boot for REST
    implementation("org.springframework.boot:spring-boot-starter-web")


    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
}

// ✅ Include generated Java code in the Kotlin project
sourceSets.main {
    java.srcDir("src/generated/java") // ✅ Make sure Kotlin can use the Java files
}

tasks.generateGrammarSource {
    // Adjust grammar source folder if needed
    // inputDirectory = file("src/main/antlr")
    outputDirectory = file("src/generated/java/com/example")

    arguments.add("-visitor") // Generate a visitor
    arguments.add("-listener") // Generate a listener (if you want)
}

tasks.compileKotlin {
    dependsOn(tasks.generateGrammarSource)
}

tasks.test {
    useJUnitPlatform()
}

//kotlin {
//    jvmToolchain(23)
//}