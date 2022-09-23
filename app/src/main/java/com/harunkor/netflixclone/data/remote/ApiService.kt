package com.harunkor.netflixclone.data.remote

import com.harunkor.netflixclone.domain.model.comingsoon.ComingSoonModel
import com.harunkor.netflixclone.domain.model.mostpopulermovies.MostPopulerMoviesModel
import com.harunkor.netflixclone.domain.model.mostpopulertv.MostPopulerTvModel
import com.harunkor.netflixclone.domain.model.searchall.SearchAllModel
import com.harunkor.netflixclone.domain.model.topmovies.TopMoviesModel
import com.harunkor.netflixclone.domain.model.toptv.TopTvModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("Top250Movies")
    fun getTopMovies(@Query("apiKey") apiKey:String): Call<TopMoviesModel>

    @GET("MostPopularMovies")
    fun getMostPopulerMovies(@Query("apiKey") apiKey:String): Call<MostPopulerMoviesModel>

    @GET("ComingSoon")
    fun getComingSoon(@Query("apiKey") apiKey:String): Call<ComingSoonModel>

    @GET("SearchAll")
    fun getSearchAll(@Query("apiKey") apiKey:String,@Query("expression") searchText:String): Call<SearchAllModel>

    @GET("MostPopularTVs")
    fun getMostPopulerTv(@Query("apiKey") apiKey:String): Call<MostPopulerTvModel>

    @GET("Top250TVs")
    fun getTopTv(@Query("apiKey") apiKey:String): Call<TopTvModel>


}