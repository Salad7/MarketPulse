package com.example.marketpulse.Objects

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)

data class BitcoinObject(var code :String,
                         var symbol :String,
                         val rate :String,
                         @Json(name = "description") val desc :String,
                         val rate_float :Float) {

}