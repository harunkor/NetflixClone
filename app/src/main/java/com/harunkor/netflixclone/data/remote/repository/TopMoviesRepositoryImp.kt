package com.harunkor.netflixclone.data.remote.repository

import com.harunkor.netflixclone.data.remote.ApiService
import com.harunkor.netflixclone.domain.model.TopMoviesModel
import com.harunkor.netflixclone.domain.repository.TopMoviesRepository
import retrofit2.Call

class TopMoviesRepositoryImp(private val apiService: ApiService): TopMoviesRepository {

    override fun getTopMovies(apiKey: String): Call<TopMoviesModel> {
       return apiService.getTopMovies(apiKey)
    }

}