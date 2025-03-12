package com.hitechcyclocomputer.android

import android.app.Service
import android.content.Intent
import android.os.IBinder

class GpsTrackingService : Service() {
  override fun onBind(intent: Intent?): IBinder? {
    return null
  }

  override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
    // Implement GPS tracking logic here
    return START_STICKY
  }
}
