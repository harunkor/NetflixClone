package com.harunkor.netflixclone.domain.model.topmovies

data class TopMoviesModel(
    val errorMessage: String,
    val items: List<TopMoviesItem>
)