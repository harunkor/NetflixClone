package com.harunkor.netflixclone.domain.model.searchall

data class SearchAllModel(
    val errorMessage: String,
    val expression: String,
    val results: List<Result>,
    val searchType: String
)