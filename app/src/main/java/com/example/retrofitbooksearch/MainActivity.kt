package com.example.retrofitbooksearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var bookSearchAdapter : BookSearchAdapter
    val bookData = mutableListOf<BookData>()
    private val bookRecycler : RecyclerView = findViewById(R.id.book_recycler)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        bookSearchAdapter = BookSearchAdapter(this)
        bookRecycler.adapter = bookSearchAdapter
        bookData.apply {
            add(BookData(R.drawable.book, "민규", "똑똒", R.drawable.book))
        }
    }
}