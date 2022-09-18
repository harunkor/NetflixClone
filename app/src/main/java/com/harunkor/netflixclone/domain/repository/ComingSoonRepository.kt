package com.harunkor.netflixclone.domain.repository

import com.harunkor.netflixclone.domain.model.comingsoon.ComingSoonModel
import retrofit2.Call

interface ComingSoonRepository {

    fun getComingSoon(apiKey: String): Call<ComingSoonModel>
}