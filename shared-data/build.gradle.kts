plugins {
  kotlin("multiplatform")
  id("com.squareup.sqldelight")
}

kotlin {
  jvm()
  ios()
  sourceSets {
    val commonMain by getting {
      dependencies {
        implementation("com.squareup.sqldelight:runtime:1.5.3")
        implementation("com.squareup.retrofit2:retrofit:2.9.0")
        implementation("com.squareup.okhttp3:okhttp:4.10.0")
      }
    }
  }
}

sqldelight {
  database("CycloDatabase") {
    packageName = "com.hitechcyclocomputer.data"
  }
}
