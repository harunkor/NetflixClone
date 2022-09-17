package com.harunkor.netflixclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.harunkor.netflixclone.databinding.ActivityMainBinding
import com.harunkor.netflixclone.domain.model.TopMoviesModel
import com.harunkor.netflixclone.presentation.topmovies.TopMoviesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val topMoviesModel by viewModels<TopMoviesViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        topMoviesModel.getTopMovies().observe(this, Observer {
            binding.responseText.text = it.items.get(0).toString()
        })


    }
}