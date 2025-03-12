plugins {
  kotlin("multiplatform")
}

kotlin {
  jvm()
  ios()
  sourceSets {
    val commonMain by getting {
      dependencies {
        implementation("org.koin:koin-core:3.2.0")
      }
    }
  }
}
