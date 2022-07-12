package com.example.watch_trueid_mini_project

val MOVIE_ID = "movieExtra"
var movieList = mutableListOf<Movie>()
class Movie (
    var cover: Int,
    var title: String,
    var category: String,
    var description : String,
    var id: Int? = movieList.size
)