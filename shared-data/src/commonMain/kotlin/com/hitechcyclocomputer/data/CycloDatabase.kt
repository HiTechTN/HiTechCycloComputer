package com.hitechcyclocomputer.data

import com.squareup.sqldelight.db.SqlDriver

interface CycloDatabase {
  fun getQueries(): CycloDatabaseQueries
}
