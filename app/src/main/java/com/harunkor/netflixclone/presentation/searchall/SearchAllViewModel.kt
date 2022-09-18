package com.harunkor.netflixclone.presentation.searchall

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.harunkor.netflixclone.domain.model.searchall.SearchAllModel
import com.harunkor.netflixclone.domain.usecase.SearchAllUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchAllViewModel @Inject constructor(private val searchAllUseCase: SearchAllUseCase):ViewModel() {

    fun getSearchAll(searchText: String): LiveData<SearchAllModel> {
        searchAllUseCase.apply {
            getSearchAll(searchText)
            return searchAll
        }
    }

}