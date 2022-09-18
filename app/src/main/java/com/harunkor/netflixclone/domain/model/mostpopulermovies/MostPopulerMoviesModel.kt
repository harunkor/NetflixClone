package com.harunkor.netflixclone.domain.model.mostpopulermovies

data class MostPopulerMoviesModel(
    val errorMessage: String,
    val items: List<MostPopulerMoviesItem>
)