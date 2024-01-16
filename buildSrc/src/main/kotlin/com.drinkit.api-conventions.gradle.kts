plugins {
    id("com.drinkit.common-conventions")

    id("com.gorylenko.gradle-git-properties")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    testImplementation("io.rest-assured:rest-assured:5.4.0")
}

// Create a `build-info.properties` file in resource folder, info available in Actuator
springBoot {
    buildInfo()
}

// Create a `git.properties` file in resource folder, info available in Actuator
gitProperties {
    gitPropertiesName = "git.properties"
    keys = listOf("git.branch", "git.commit.id", "git.commit.time", "git.commit.message.short")
}

// Avoid information leaks from spring profiles files in generated fat Jar
/*tasks.withType<Jar> {
    exclude("application-*.yml")
}*/