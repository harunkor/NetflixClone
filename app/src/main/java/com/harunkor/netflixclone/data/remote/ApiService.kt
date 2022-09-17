package com.harunkor.netflixclone.data.remote

import com.harunkor.netflixclone.domain.model.TopMoviesModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("Top250Movies")
    fun getTopMovies(@Query("apiKey") apiKey:String): Call<TopMoviesModel>

}