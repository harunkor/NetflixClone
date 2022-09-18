package com.harunkor.netflixclone.domain.model.mostpopulermovies

data class MostPopulerMoviesItem(
    val crew: String,
    val fullTitle: String,
    val id: String,
    val imDbRating: String,
    val imDbRatingCount: String,
    val image: String,
    val rank: String,
    val rankUpDown: String,
    val title: String,
    val year: String
)