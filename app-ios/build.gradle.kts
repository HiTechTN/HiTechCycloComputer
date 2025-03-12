plugins {
  kotlin("multiplatform")
}

kotlin {
  ios()
  sourceSets {
    val iosMain by getting {
      dependencies {
        implementation(project(":shared-core"))
        implementation(project(":shared-data"))
        implementation(project(":shared-domain"))
      }
    }
  }
}
