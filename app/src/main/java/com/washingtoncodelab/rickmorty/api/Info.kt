package com.washingtoncodelab.rickmorty.api

import com.squareup.moshi.Json

data class Info(
    @Json(name = "name")
    val infoName : String,
    @Json(name = "status")
    val infoStatus: String,
    @Json(name = "species")
    val infoSpecies: String,
    @Json(name = "image")
    val infoImage : String
)
