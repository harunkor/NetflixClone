package com.harunkor.netflixclone.domain.model.comingsoon

data class ComingSoonModel(
    val errorMessage: String,
    val items: List<ComingSoonItem>
)