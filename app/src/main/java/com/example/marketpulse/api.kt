package com.example.marketpulse

import com.example.marketpulse.Objects.RootResponse
import retrofit2.http.GET

interface api {
    @GET("v1/bpi/currentprice.json")
    suspend fun getBitcoinPrice() : RootResponse
}