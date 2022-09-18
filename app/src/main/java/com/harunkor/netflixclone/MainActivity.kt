package com.harunkor.netflixclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.harunkor.netflixclone.databinding.ActivityMainBinding
import com.harunkor.netflixclone.presentation.comingsoon.ComingSoonViewModel
import com.harunkor.netflixclone.presentation.mostpopulermovies.MostPopulerMoviesViewModel
import com.harunkor.netflixclone.presentation.mostpopulertv.MostPopulerTvViewModel
import com.harunkor.netflixclone.presentation.searchall.SearchAllViewModel
import com.harunkor.netflixclone.presentation.toptv.TopTvViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
     //private val topMoviesModel by viewModels<TopMoviesViewModel>()
     // private val mostPopulerMoviesModel by viewModels<MostPopulerMoviesViewModel>()
     // private val comingSoonViewModel by viewModels<ComingSoonViewModel>()
    // private val searchAllViewModel by viewModels<SearchAllViewModel>()
    // private val mostPopulerTvViewModel by viewModels<MostPopulerTvViewModel>()
      private val topTvViewModel by viewModels<TopTvViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

       /* topMoviesModel.getTopMovies().observe(this, Observer {
            binding.responseText.text = it.items.get(0).toString()
        })*/

        /*mostPopulerMoviesModel.getMostPopulerMovies().observe(this, Observer {
            binding.responseText.text = it.items.get(0).toString()
        })*/

        /*comingSoonViewModel.getComingSoon().observe(this) {
            binding.responseText.text = it.items.get(0).toString()
        }*/

        /*searchAllViewModel.getSearchAll("batman").observe(this){
            binding.responseText.text = it.results.get(0).toString()
        }*/

       /* mostPopulerTvViewModel.getMostPopulerTv().observe(this) {
            binding.responseText.text = it.items.get(0).toString()
        }*/

        topTvViewModel.getTopTv().observe(this){
            binding.responseText.text = it.items.get(0).toString()
        }


    }
}