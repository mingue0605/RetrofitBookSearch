package com.example.retrofitbooksearch

import android.widget.ImageView

data class BookData(
    val bookImg : Int,
    val bookTitle : String,
    val bookDetail : String,
    val like : Int
)