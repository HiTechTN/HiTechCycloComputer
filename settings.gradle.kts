pluginManagement {
  repositories {
    google()
    gradlePluginPortal()
    mavenCentral()
  }
}
rootProject.name = "HiTechCycloComputer"
include(":app-android", ":app-ios", ":shared-core", ":shared-data", ":shared-domain")
