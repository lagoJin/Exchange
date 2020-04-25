object Dep {

    object AndroidX {
        val jetifier = "com.android.tools.build.jetifier:jetifier-core:1.0.0-beta02"
        val appCompat = "androidx.appcompat:appcompat:1.1.0"
        val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
        val constraint = "androidx.constraintlayout:constraintlayout:2.0.0-beta4"
        val design = "com.google.android.material:material:1.2.0-alpha05"
        val coreKtx = "androidx.core:core-ktx:1.2.0-rc01"
        val preference = "androidx.preference:preference:1.1.0"
        val activityKtx = "androidx.activity:activity-ktx:1.1.0"
        val fragmentKtx = "androidx.fragment:fragment-ktx:1.2.2"

        val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata:2.2.0"
        val liveDataCoreKtx = "androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0"
        val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:2.2.0"


        object Navigation {
            val version = "2.3.0-alpha03"
            val runtimeKtx = "androidx.navigation:navigation-runtime-ktx:$version"
            val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$version"
            val uiKtx = "androidx.navigation:navigation-ui-ktx:2.3.0-alpha03"
            val dynamicFeaturesFragment =
                "androidx.navigation:navigation-dynamic-features-fragment:$version"
        }
    }

    object Threetenabp {
        val version = "1.2.4"
        val threetenabp = "com.jakewharton.threetenabp:threetenabp:$version"
    }

    object Kotlin {
        val version = "1.3.72"
        val stdlibJvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
        val coroutinesVersion = "1.3.5"
        val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
    }

    object Dagger {
        val version = "2.27"
        val core = "com.google.dagger:dagger:$version"
        val compiler = "com.google.dagger:dagger-compiler:$version"
        val androidSupport = "com.google.dagger:dagger-android-support:$version"
        val android = "com.google.dagger:dagger-android:$version"
        val androidProcessor = "com.google.dagger:dagger-android-processor:$version"
        val assistedInjectAnnotations =
            "com.squareup.inject:assisted-inject-annotations-dagger2:0.5.2"
        val assistedInjectProcessor = "com.squareup.inject:assisted-inject-processor-dagger2:0.5.2"
    }

}