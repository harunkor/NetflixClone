package com.harunkor.netflixclone.domain.model.comingsoon

data class ComingSoonItem(
    val contentRating: String,
    val directorList: List<ComingSoonDirector>,
    val directors: String,
    val fullTitle: String,
    val genreList: List<ComingSoonGenre>,
    val genres: String,
    val id: String,
    val imDbRating: String,
    val imDbRatingCount: String,
    val image: String,
    val metacriticRating: String,
    val plot: String,
    val releaseState: String,
    val runtimeMins: String,
    val runtimeStr: String,
    val starList: List<ComingSoonStar>,
    val stars: String,
    val title: String,
    val year: String
)