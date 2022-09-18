package com.harunkor.netflixclone.data.remote.repository

import com.harunkor.netflixclone.data.remote.ApiService
import com.harunkor.netflixclone.domain.model.toptv.TopTvModel
import com.harunkor.netflixclone.domain.repository.TopTvRepository
import retrofit2.Call

class TopTvRepositoryImp(private val apiService: ApiService): TopTvRepository {

    override fun getTopTv(apiKey: String): Call<TopTvModel> {
       return apiService.getTopTv(apiKey)
    }

}