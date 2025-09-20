plugins {
    java
    id("org.springframework.boot") version "3.5.5"
    id("io.spring.dependency-management") version "1.1.7"

    // Lombok
    id("io.freefair.lombok") version "8.12"
}

group = "com.moka"
version = "0.1"
description = "monitoring"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    // Spring
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-validation")

    // h2
    runtimeOnly("com.h2database:h2")

    // configuration
    // https://www.baeldung.com/intellij-resolve-spring-boot-configuration-properties
    implementation("org.springframework.boot:spring-boot-configuration-processor")

    // jsoup
    implementation("org.jsoup:jsoup:1.20.1")

    // actuator
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    //////////////
    // TEST
    //////////////
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("com.github.gavlyukovskiy:p6spy-spring-boot-starter:1.12.0")
    testImplementation("com.github.gavlyukovskiy:datasource-decorator-spring-boot-autoconfigure")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    testRuntimeOnly("com.h2database:h2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
