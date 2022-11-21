package com.example.marketpulse.Objects

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BpiObject(@Json(name = "USD") val bo :BitcoinObject) {
}