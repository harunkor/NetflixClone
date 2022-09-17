package com.harunkor.netflixclone.domain.model

data class TopMoviesModel(
    val errorMessage: String,
    val items: List<Item>
)