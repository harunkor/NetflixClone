package com.harunkor.netflixclone.domain.usecase

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.harunkor.netflixclone.domain.model.topmovies.TopMoviesModel
import com.harunkor.netflixclone.domain.repository.TopMoviesRepository
import com.harunkor.netflixclone.utils.Constants.Companion.API_KEY
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class TopMoviesUseCase @Inject constructor(
    private val topMoviesRepository: TopMoviesRepository
) {

    private var _topMovies = MutableLiveData<TopMoviesModel>()
    val topMovies: LiveData<TopMoviesModel> = _topMovies

    fun getTopMovies(){
        topMoviesRepository.getTopMovies(API_KEY).enqueue(object: Callback<TopMoviesModel>{
            override fun onResponse(
                call: Call<TopMoviesModel>,
                response: Response<TopMoviesModel>
            ) {
                _topMovies.value = response.body()
            }

            override fun onFailure(call: Call<TopMoviesModel>, t: Throwable) {
                Log.v("ERROR",t.message.toString())
            }

        })
    }


}