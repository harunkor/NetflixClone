package com.harunkor.netflixclone.domain.usecase

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.harunkor.netflixclone.domain.model.searchall.SearchAllModel
import com.harunkor.netflixclone.domain.repository.SearchAllRepository
import com.harunkor.netflixclone.utils.Constants.Companion.API_KEY
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class SearchAllUseCase @Inject constructor(private val searchAllRepository: SearchAllRepository) {

    private var _searchAll = MutableLiveData<SearchAllModel>()
    val searchAll: LiveData<SearchAllModel> = _searchAll

    fun getSearchAll(searchText: String){
        searchAllRepository.getSearchAll(API_KEY,searchText).enqueue(object: Callback<SearchAllModel>{
            override fun onResponse(
                call: Call<SearchAllModel>,
                response: Response<SearchAllModel>
            ) {
                _searchAll.value = response.body()
            }

            override fun onFailure(call: Call<SearchAllModel>, t: Throwable) {
                Log.v("ERROR",t.message.toString())
            }

        })

    }



}