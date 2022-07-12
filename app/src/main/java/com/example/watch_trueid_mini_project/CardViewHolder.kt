package com.example.watch_trueid_mini_project

import androidx.recyclerview.widget.RecyclerView
import com.example.watch_trueid_mini_project.databinding.MovieCardBinding


class CardViewHolder(
    private val movieCardBinding: MovieCardBinding,
    private val clickListener: MovieClickListener

) : RecyclerView.ViewHolder(movieCardBinding.root) {
    fun bindMovie(movie: Movie) {
        movieCardBinding.movieImageView.setImageResource(movie.cover)
        movieCardBinding.movieTextViewTitle.text = movie.title

        movieCardBinding.movieCardView.setOnClickListener{
            clickListener.onClick(movie)
        }
    }
}

