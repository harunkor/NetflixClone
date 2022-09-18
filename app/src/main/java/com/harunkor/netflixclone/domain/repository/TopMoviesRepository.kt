package com.harunkor.netflixclone.domain.repository

import com.harunkor.netflixclone.domain.model.topmovies.TopMoviesModel
import retrofit2.Call

interface TopMoviesRepository {

    fun getTopMovies(apiKey:String): Call<TopMoviesModel>
}