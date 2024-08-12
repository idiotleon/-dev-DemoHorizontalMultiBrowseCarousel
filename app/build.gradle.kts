plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" // this version matches your Kotlin version
}

android {
    namespace = "com.idiotleon.demo.demoHorizontalMultiBrowseCarousel"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.idiotleon.demo.demoHorizontalMultiBrowseCarousel"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.15"
    }
}

dependencies {
//    implementation(libs.androidx.core.ktx)

    implementation(libs.androidx.activity)
    implementation(libs.androidx.activity.compose)

    implementation(libs.androidx.compose.material3)

//    implementation(libs.androidx.compose.compiler)
//    implementation(libs.androidx.compose.ui)
//    implementation(libs.androidx.compose.foundation)
//    implementation(libs.androidx.compose.foundation.layout)
//    implementation(libs.androidx.compose.animation.core)
//    implementation(libs.androidx.compose.runtime)
//    implementation(libs.androidx.compose.ui.tooling.preview)
//    implementation(libs.androidx.compose.ui.util)
//    implementation(libs.androidx.core.ktx)

    implementation(libs.coil.kt)
    implementation(libs.coil.kt.compose)
    implementation(libs.coil.kt.svg)
}