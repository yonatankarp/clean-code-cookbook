plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.spotless)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.bundles.kotlin.all)
}

spotless {
    kotlin {
        target("**/*.kt")
    }

    kotlinGradle {
        target("*.gradle.kts")
    }

    format("markdown") {
        target("**/*.md")
        prettier().config(mapOf("proseWrap" to "always"))
    }
}
