package com.hitechcyclocomputer.core

object Utils {
  fun formatDistance(distance: Double): String {
    return String.format("%.2f km", distance / 1000)
  }
}
