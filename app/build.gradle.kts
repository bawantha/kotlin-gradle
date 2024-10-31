plugins{
    id("application")
}

java{
    java.toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

application{
    mainClass.set("Application")
}

dependencies{
    implementation(project(":business-logic"))
    implementation(project(":data-model"))
}