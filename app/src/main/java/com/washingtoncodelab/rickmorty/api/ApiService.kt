package com.washingtoncodelab.rickmorty.api

import androidx.recyclerview.widget.RecyclerView
import com.washingtoncodelab.rickmorty.fragment.mainadapter.MainAdapter
import retrofit2.http.GET
import retrofit2.http.Query

private val BASE_URL = "https://rickandmortyapi.com/api/"

interface ApiService{
@GET("character")
suspend fun getInfo(@Query("character")info:String):InfoResponse

}