package com.harunkor.netflixclone.domain.repository

import com.harunkor.netflixclone.domain.model.mostpopulermovies.MostPopulerMoviesModel
import retrofit2.Call

interface MostPopulerMoviesRepository {

    fun getMostPopulerMovies(apiKey: String): Call<MostPopulerMoviesModel>

}