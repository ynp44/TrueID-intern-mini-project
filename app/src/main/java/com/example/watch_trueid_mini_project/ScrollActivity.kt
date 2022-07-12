//package com.example.watch_trueid_mini_project
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.recyclerview.widget.GridLayoutManager
//import com.example.watch_trueid_mini_project.databinding.ActivityScrollBinding
//
//class ScrollActivity : AppCompatActivity() {
//
//    private lateinit var binding: ActivityScrollBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_scroll)
//        for (i in 1..5) {
//            binding = ActivityScrollBinding.inflate(layoutInflater) //create more layout
//            setContentView(binding.root)
//        }
//
//        val scrollActivity = this
//        binding.scrollVertical.apply {
//            layoutManager =
//                GridLayoutManager(applicationContext, 1, GridLayoutManager.VERTICAL, false)
//            adapter = CardAdapter(movieList, scrollActivity) //add movie info to layout
//        }
//    }
//}