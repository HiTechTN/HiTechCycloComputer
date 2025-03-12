package com.hitechcyclocomputer.data

import android.content.Context
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

class AndroidCycloDatabase(context: Context) : CycloDatabase {
  private val driver: SqlDriver = AndroidSqliteDriver(CycloDatabase.Schema, context, "cyclo.db")
  private val database = CycloDatabase(driver)

  override fun getQueries(): CycloDatabaseQueries = database.cycloDatabaseQueries
}
