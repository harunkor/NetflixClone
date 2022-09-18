package com.harunkor.netflixclone.data.remote.repository

import com.harunkor.netflixclone.data.remote.ApiService
import com.harunkor.netflixclone.domain.model.searchall.SearchAllModel
import com.harunkor.netflixclone.domain.repository.SearchAllRepository
import retrofit2.Call

class SearchAllRepositoryImp(private val apiService: ApiService): SearchAllRepository {


    override fun getSearchAll(apiKey: String, searchText: String): Call<SearchAllModel> {
        return apiService.getSearchAll(apiKey,searchText)
    }

}