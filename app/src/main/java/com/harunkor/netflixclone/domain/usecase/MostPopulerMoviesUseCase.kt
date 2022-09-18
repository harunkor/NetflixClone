package com.harunkor.netflixclone.domain.usecase

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.harunkor.netflixclone.domain.model.mostpopulermovies.MostPopulerMoviesModel
import com.harunkor.netflixclone.domain.repository.MostPopulerMoviesRepository
import com.harunkor.netflixclone.utils.Constants.Companion.API_KEY
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MostPopulerMoviesUseCase @Inject constructor(private val mostPopulerMoviesRepository: MostPopulerMoviesRepository) {

    private var _mostPopulerMovies = MutableLiveData<MostPopulerMoviesModel>()
    val mostPopulerMovies: LiveData<MostPopulerMoviesModel> = _mostPopulerMovies

    fun getMostPopulerMovies(){
        mostPopulerMoviesRepository.getMostPopulerMovies(API_KEY).enqueue(object: Callback<MostPopulerMoviesModel>{
            override fun onResponse(
                call: Call<MostPopulerMoviesModel>,
                response: Response<MostPopulerMoviesModel>
            ) {
              _mostPopulerMovies.value = response.body()
            }

            override fun onFailure(call: Call<MostPopulerMoviesModel>, t: Throwable) {
              Log.v("ERROR",t.message.toString())
            }


        })

    }


}