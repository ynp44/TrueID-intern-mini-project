package com.example.watch_trueid_mini_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.watch_trueid_mini_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MovieClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater) //create more layout
        setContentView(binding.root)

        addMovie()


        val mainActivity = this
        binding.shelfScrollHorizontal.apply {
            layoutManager =
                GridLayoutManager(applicationContext, 1, GridLayoutManager.HORIZONTAL, false)
            adapter = CardAdapter(movieList, mainActivity) //add movie info to layout
        }
    }

    override fun onClick(movie: Movie) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(MOVIE_ID, movie.id)
        startActivity(intent)
    }

    private fun addMovie() {
        val movie1 = Movie(
            R.drawable.ic_movie,
            "The Godfather",
            "Drama",
            "dkdkkdkdkdkdkdkdkdkdkkd\n jsjsjsjsjsjjssjjsjsjsjs\n ksksksksjsjsjksksksk\n kskskskskskss"
        )
        movieList.add(movie1)

        val movie2 = Movie(
            R.drawable.ic_movie,
            "Top Gun Maverick",
            "Action",
            "kdkdkdkslopeoeo"
        )
        movieList.add(movie2)

        val movie3 = Movie(
            R.drawable.ic_movie,
            "Spiderman",
            "Action",
            "gkdlsopsoekeklsdsd"
        )
        movieList.add(movie3)

        val movie4 = Movie(
            R.drawable.ic_movie,
            "Ironman",
            "Action",
            "wuiejehnfidsfjaoiksdfjk"
        )
        movieList.add(movie4)

        val movie5 = Movie(
            R.drawable.ic_movie,
            "Fast and Furious",
            "Action",
            "kdkdkdkslopeoeo"
        )
        movieList.add(movie5)

        val movie6 = Movie(
            R.drawable.ic_movie,
            "Batman",
            "Action",
            "dfdfrrgrgr"
        )
        movieList.add(movie6)

        val movie7 = Movie(
            R.drawable.ic_movie,
            "Superman",
            "Action",
            "ieroeikudjlaoeirr"
        )
        movieList.add(movie7)

        val movie8 = Movie(
            R.drawable.ic_movie,
            "Narcos",
            "Drama",
            "ueiejwejwekwelo"
        )
        movieList.add(movie8)

        val movie9 = Movie(
            R.drawable.ic_movie,
            "Breaking Bad",
            "Drama",
            "kdkdkdkslopeoeo"
        )
        movieList.add(movie9)

        val movie10 = Movie(
            R.drawable.ic_movie, "Thor",
            "Action",
            "sdirjrpsjrlwla"
        )
        movieList.add(movie10)

    }


}