package com.example.retrofitbooksearch

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BookSearchAdapter(private val context: Context)  : RecyclerView.Adapter<BookSearchAdapter.ViewHolder>(){
    inner class ViewHolder(view:View) : RecyclerView.ViewHolder(view){
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_book_search,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = 3

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

}