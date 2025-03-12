package com.hitechcyclocomputer.data

import com.squareup.sqldelight.Query

interface CycloDatabaseQueries {
  fun getAllRides(): Query<CycloDatabase.Ride>
}
