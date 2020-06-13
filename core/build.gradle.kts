plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("androidx.navigation.safeargs.kotlin")
}

android.buildFeatures.dataBinding = true

apply {
    from(rootProject.file("ktlint.gradle"))
    from(rootProject.file("gradle/android.gradle"))
}

dependencies {
    implementation(Dep.AndroidX.appCompat)

    implementation(Dep.Kotlin.stdlibJvm)
    implementation(Dep.AndroidX.activityKtx)
    implementation(Dep.AndroidX.fragmentKtx)

    implementation(Dep.AndroidX.Navigation.fragmentKtx)

    implementation(Dep.Coil.coil)

    implementation(Dep.Util.timber)
}
