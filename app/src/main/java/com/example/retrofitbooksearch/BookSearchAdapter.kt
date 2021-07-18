package com.example.retrofitbooksearch

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class BookSearchAdapter(private val context: Context)  : RecyclerView.Adapter<BookSearchAdapter.ViewHolder>(){
    private var bookDataSize = mutableListOf<BookData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_book_search,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = bookDataSize.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(bookDataSize[position])
    }


    inner class ViewHolder(view:View) : RecyclerView.ViewHolder(view){
        private val bookImg : ImageView = itemView.findViewById(R.id.bookImg)
        private val bookTitle : TextView = itemView.findViewById(R.id.book_title)
        private val bookDetail : TextView = itemView.findViewById(R.id.book_detail)
        private val bookLike : ImageView = itemView.findViewById(R.id.like)

        fun bind(item : BookData){
//            Glide.with(itemView).load(item.bookImg).into(bookImg)
//            bookTitle.text = item.bookTitle
//            bookDetail.text = item.bookDetail
        }
    }
}