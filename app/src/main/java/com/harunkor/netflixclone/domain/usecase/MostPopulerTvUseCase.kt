package com.harunkor.netflixclone.domain.usecase

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.harunkor.netflixclone.domain.model.mostpopulertv.MostPopulerTvModel
import com.harunkor.netflixclone.domain.repository.MostPopulerTvRepository
import com.harunkor.netflixclone.utils.Constants.Companion.API_KEY
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MostPopulerTvUseCase @Inject constructor(private val mostPopulerTvRepository: MostPopulerTvRepository) {


    private var _mostPopulerTv = MutableLiveData<MostPopulerTvModel>()
    val mostPopulerTv: LiveData<MostPopulerTvModel> = _mostPopulerTv


    fun getMostPopulerTv(){
        mostPopulerTvRepository.getMostPopulerTv(API_KEY).enqueue(object: Callback<MostPopulerTvModel>{
            override fun onResponse(
                call: Call<MostPopulerTvModel>,
                response: Response<MostPopulerTvModel>
            ) {
                _mostPopulerTv.value = response.body()
            }

            override fun onFailure(call: Call<MostPopulerTvModel>, t: Throwable) {
                Log.v("ERROR",t.message.toString())
            }

        })
    }


}