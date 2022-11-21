package com.example.marketpulse.Objects

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RootResponse(val bpi : BpiObject) {
}