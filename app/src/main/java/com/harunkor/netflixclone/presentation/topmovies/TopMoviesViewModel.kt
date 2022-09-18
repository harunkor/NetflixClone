package com.harunkor.netflixclone.presentation.topmovies

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.harunkor.netflixclone.domain.model.topmovies.TopMoviesModel
import com.harunkor.netflixclone.domain.usecase.TopMoviesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class TopMoviesViewModel @Inject constructor(
    private val topMoviesUseCase: TopMoviesUseCase
): ViewModel() {

    fun getTopMovies(): LiveData<TopMoviesModel> {
        topMoviesUseCase.apply {
            getTopMovies()
            return topMovies
        }
    }

}