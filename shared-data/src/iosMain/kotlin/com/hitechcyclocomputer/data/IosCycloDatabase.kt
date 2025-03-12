package com.hitechcyclocomputer.data

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

class IosCycloDatabase : CycloDatabase {
  private val driver: SqlDriver = NativeSqliteDriver(CycloDatabase.Schema, "cyclo.db")
  private val database = CycloDatabase(driver)

  override fun getQueries(): CycloDatabaseQueries = database.cycloDatabaseQueries
}
