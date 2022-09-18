package com.harunkor.netflixclone.data.remote.repository

import com.harunkor.netflixclone.data.remote.ApiService
import com.harunkor.netflixclone.domain.model.comingsoon.ComingSoonModel
import com.harunkor.netflixclone.domain.repository.ComingSoonRepository
import retrofit2.Call

class ComingSoonRepositoryImp(private val apiService: ApiService): ComingSoonRepository {

    override fun getComingSoon(apiKey: String): Call<ComingSoonModel> {
       return apiService.getComingSoon(apiKey)
    }

}