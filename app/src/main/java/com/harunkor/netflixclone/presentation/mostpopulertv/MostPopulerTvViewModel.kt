package com.harunkor.netflixclone.presentation.mostpopulertv

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.harunkor.netflixclone.domain.model.mostpopulertv.MostPopulerTvModel
import com.harunkor.netflixclone.domain.usecase.MostPopulerTvUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MostPopulerTvViewModel @Inject constructor(
    private val mostPopulerTvUseCase: MostPopulerTvUseCase
):ViewModel() {

    fun getMostPopulerTv(): LiveData<MostPopulerTvModel> {
        with(mostPopulerTvUseCase){
            getMostPopulerTv()
            return mostPopulerTv
        }
    }


}