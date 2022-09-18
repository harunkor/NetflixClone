package com.harunkor.netflixclone.domain.repository


import com.harunkor.netflixclone.domain.model.mostpopulertv.MostPopulerTvModel
import retrofit2.Call

interface MostPopulerTvRepository {

    fun getMostPopulerTv(apiKey: String): Call<MostPopulerTvModel>
}