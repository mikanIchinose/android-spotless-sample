plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.kotlinAndroid) apply false
    id("com.diffplug.spotless") version "6.19.0"
}

spotless {
    ratchetFrom("main")
    kotlin {
        target("**/*.kt")
        targetExclude("**/build/**/*.kt", "/**/*Test.kt")
        ktlint()
        trimTrailingWhitespace()
        endWithNewline()
    }
}
