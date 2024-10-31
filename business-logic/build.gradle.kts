plugins{
    id("java-library")
}

java{
    java.toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

dependencies{
    implementation(project(":data-model"))
    implementation("org.apache.commons:commons-lang3:3.12.0")
}