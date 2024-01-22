plugins {
    id("com.drinkit.api-conventions")
    id("com.drinkit.contract-first")
}

dependencies {
    implementation(project(":drinkit-domain"))
    implementation(project(":drinkit-infra"))

    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.jooq:jooq:3.19.2") // Remove this dependency here (fix version using platform & constraints)

    openApiInput(project(":drinkit-api-contract", "openApi"))
}


openApiGenerate {
    apiPackage.set("com.drinkit.api.generated.api")
    modelPackage.set("com.drinkit.api.generated.model")

    typeMappings.set(
        typeMappings.get() + mapOf(
            "string+cellar-id" to "CellarId"
        )
    )
    importMappings.set(
        importMappings.get() + mapOf(
            "CellarId" to "com.drinkit.cellar.CellarId"
        )
    )
}