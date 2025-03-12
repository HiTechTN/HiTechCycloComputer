package com.hitechcyclocomputer.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {
  @GET("rides")
  suspend fun getRides(): List<CycloDatabase.Ride>

  companion object {
    private const val BASE_URL = "https://api.hitechcyclocomputer.com/"

    fun create(): ApiService {
      val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
      return retrofit.create(ApiService::class.java)
    }
  }
}
