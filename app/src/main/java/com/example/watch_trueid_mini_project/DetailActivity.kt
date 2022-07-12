package com.example.watch_trueid_mini_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.watch_trueid_mini_project.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movieID = intent.getIntExtra(MOVIE_ID,-1)
        val movie = movieFromID(movieID)
        if (movie != null) {
            binding.movieDetailImageView.setImageResource(movie.cover)
            binding.titleDetailTextView.text = movie.title
            binding.categoryDetailTextView.text = movie.category
            binding.descriptionTextView.text = movie.description


        }

    }
    private fun movieFromID(movieId:Int): Movie?{
        for (movie in movieList){
            if (movie.id == movieId)
                return movie
        }
        return null
    }





}