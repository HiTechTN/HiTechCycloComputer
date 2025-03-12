package com.hitechcyclocomputer.domain

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import kotlin.test.Test
import kotlin.test.assertEquals

class GetRidesUseCaseTest {
  private val database = mockk<CycloDatabase>()
  private val queries = mockk<CycloDatabaseQueries>()
  private val useCase = GetRidesUseCase(database)

  @Test
  fun `should return list of rides`() {
    val rides = listOf(mockk<CycloDatabase.Ride>())
    every { database.getQueries() } returns queries
    every { queries.getAllRides().executeAsList() } returns rides

    val result = useCase(Unit)

    verify { queries.getAllRides().executeAsList() }
    assertEquals(rides, result)
  }
}
