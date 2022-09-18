package com.harunkor.netflixclone.domain.repository

import com.harunkor.netflixclone.domain.model.toptv.TopTvModel
import retrofit2.Call

interface TopTvRepository {

    fun getTopTv(apiKey:String): Call<TopTvModel>

}