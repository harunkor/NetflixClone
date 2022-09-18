package com.harunkor.netflixclone.domain.repository

import com.harunkor.netflixclone.domain.model.mostpopulermovies.MostPopulerMoviesModel
import com.harunkor.netflixclone.domain.model.searchall.SearchAllModel
import retrofit2.Call

interface SearchAllRepository {

    fun getSearchAll(apiKey: String,searchText:String): Call<SearchAllModel>
}