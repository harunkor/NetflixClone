package com.harunkor.netflixclone.presentation.toptv

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.harunkor.netflixclone.domain.model.toptv.TopTvModel
import com.harunkor.netflixclone.domain.usecase.TopTvUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TopTvViewModel @Inject constructor(
    private val topTvUseCase: TopTvUseCase
):ViewModel() {

    fun getTopTv(): LiveData<TopTvModel> {
        with(topTvUseCase) {
            getTopTv()
            return topTv
        }
    }

}