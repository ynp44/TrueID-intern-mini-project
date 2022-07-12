//package com.example.watch_trueid_mini_project
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.example.watch_trueid_mini_project.databinding.MovieCardBinding
//
//class ScrollAdapter() : RecyclerView.Adapter<CardViewHolder>() {
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
//        val from = LayoutInflater.from(parent.context)
//        val binding = MovieCardBinding.inflate(from, parent, false)
//        return CardViewHolder(binding, clickListener)
//    }
//
//    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
//        holder.bindMovie(movie[position])
//    }
//
//    override fun getItemCount(): Int = movie.size
//}