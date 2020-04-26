plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-android-extensions")
}

apply {
    from(rootProject.file("ktlint.gradle"))
    from(rootProject.file("gradle/android.gradle"))
}

androidExtensions {
    features = setOf("parcelize")
}

dependencies {
    implementation(Dep.Kotlin.stdlibJvm)
    implementation(Dep.Kotlin.coroutines)
}