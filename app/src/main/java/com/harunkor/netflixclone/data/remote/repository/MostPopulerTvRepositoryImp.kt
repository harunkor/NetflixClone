package com.harunkor.netflixclone.data.remote.repository

import com.harunkor.netflixclone.data.remote.ApiService
import com.harunkor.netflixclone.domain.model.mostpopulertv.MostPopulerTvModel
import com.harunkor.netflixclone.domain.repository.MostPopulerTvRepository
import retrofit2.Call

class MostPopulerTvRepositoryImp(private val apiService: ApiService): MostPopulerTvRepository {

    override fun getMostPopulerTv(apiKey: String): Call<MostPopulerTvModel> {
        return apiService.getMostPopulerTv(apiKey)
    }


}