package com.hitechcyclocomputer.domain

import com.hitechcyclocomputer.data.CycloDatabase

class GetRidesUseCase(private val database: CycloDatabase) : UseCase<Unit, List<CycloDatabase.Ride>> {
  override fun invoke(parameters: Unit): List<CycloDatabase.Ride> {
    return database.getQueries().getAllRides().executeAsList()
  }
}
