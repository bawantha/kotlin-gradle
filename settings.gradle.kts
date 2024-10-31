rootProject.name = "kotlin-gradle"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
    }
}

include("app")
include("business-logic")
include("data-model")
