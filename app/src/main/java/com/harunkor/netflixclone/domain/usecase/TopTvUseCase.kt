package com.harunkor.netflixclone.domain.usecase

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.harunkor.netflixclone.domain.model.toptv.TopTvModel
import com.harunkor.netflixclone.domain.repository.TopTvRepository
import com.harunkor.netflixclone.utils.Constants.Companion.API_KEY
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class TopTvUseCase @Inject constructor(private val topTvRepository: TopTvRepository) {

    private var _topTv = MutableLiveData<TopTvModel>()
    val topTv: LiveData<TopTvModel> = _topTv

    fun getTopTv() {
        topTvRepository.getTopTv(API_KEY).enqueue(object : Callback<TopTvModel> {
            override fun onResponse(call: Call<TopTvModel>, response: Response<TopTvModel>) {
                _topTv.value = response.body()
            }

            override fun onFailure(call: Call<TopTvModel>, t: Throwable) {
                Log.v("ERROR", t.message.toString())
            }

        })


    }


}