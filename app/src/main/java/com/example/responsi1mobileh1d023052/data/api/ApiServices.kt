package com.example.responsi1mobileh1d023052.data.api

import com.example.responsi1mobileh1d023052.data.model.Team
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface ApiServices {
    @Headers("X-Auth-Token: 078dc112e9c347ecbbdf2b1c5510bf9f")
    @GET("teams/{id}")
    suspend fun getTeam(@Path("id") id: Int): Team
}