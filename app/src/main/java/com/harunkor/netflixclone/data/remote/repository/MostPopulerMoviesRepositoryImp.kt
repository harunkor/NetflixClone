package com.harunkor.netflixclone.data.remote.repository

import com.harunkor.netflixclone.data.remote.ApiService
import com.harunkor.netflixclone.domain.model.mostpopulermovies.MostPopulerMoviesModel
import com.harunkor.netflixclone.domain.repository.MostPopulerMoviesRepository
import retrofit2.Call

class MostPopulerMoviesRepositoryImp(private val apiService: ApiService): MostPopulerMoviesRepository {

    override fun getMostPopulerMovies(apiKey: String): Call<MostPopulerMoviesModel> {
        return apiService.getMostPopulerMovies(apiKey)
    }
}