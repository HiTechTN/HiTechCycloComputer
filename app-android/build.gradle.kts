plugins {
  id("com.android.application")
  kotlin("android")
}

android {
  compileSdk = 33
  defaultConfig {
    applicationId = "com.hitechcyclocomputer.android"
    minSdk = 24
    targetSdk = 33
    versionCode = 1
    versionName = "1.0"
  }
}

dependencies {
  implementation(project(":shared-core"))
  implementation(project(":shared-data"))
  implementation(project(":shared-domain"))
  implementation("androidx.compose.ui:ui:1.3.0")
  implementation("androidx.compose.material:material:1.3.0")
  implementation("androidx.compose.ui:ui-tooling-preview:1.3.0")
}
