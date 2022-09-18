package com.harunkor.netflixclone.presentation.comingsoon

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.harunkor.netflixclone.domain.model.comingsoon.ComingSoonModel
import com.harunkor.netflixclone.domain.usecase.ComingSoonUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ComingSoonViewModel @Inject constructor(
    private val comingSoonUseCase: ComingSoonUseCase
):ViewModel() {

    fun getComingSoon(): LiveData<ComingSoonModel> {
        comingSoonUseCase.apply {
            getComingSoon()
            return comingSoon
        }
    }

}