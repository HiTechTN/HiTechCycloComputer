plugins {
  kotlin("multiplatform")
}

kotlin {
  jvm()
  ios()
  sourceSets {
    val commonMain by getting {
      dependencies {
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
      }
    }
  }
}
