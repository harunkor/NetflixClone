package com.harunkor.netflixclone.domain.usecase

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.harunkor.netflixclone.domain.model.comingsoon.ComingSoonModel
import com.harunkor.netflixclone.domain.repository.ComingSoonRepository
import com.harunkor.netflixclone.utils.Constants.Companion.API_KEY
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class ComingSoonUseCase @Inject constructor(private  val comingSoonRepository: ComingSoonRepository) {

     private var _comingSoon = MutableLiveData<ComingSoonModel>()
     val comingSoon: LiveData<ComingSoonModel> = _comingSoon

    fun getComingSoon(){
        comingSoonRepository.getComingSoon(API_KEY).enqueue(object : Callback<ComingSoonModel>{
            override fun onResponse(
                call: Call<ComingSoonModel>,
                response: Response<ComingSoonModel>
            ) {
                _comingSoon.value = response.body()
            }

            override fun onFailure(call: Call<ComingSoonModel>, t: Throwable) {
                Log.v("ERROR",t.message.toString())
            }

        })
    }



}