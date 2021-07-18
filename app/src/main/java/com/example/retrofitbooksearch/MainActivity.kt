package com.example.retrofitbooksearch

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    val BASE_URL_NAVER_API = "https://openapi.naver.com/"
    val CLIENT_ID = "IntEsoCFJH0w8SCIQXWm"
    val CLIENT_SECRET = "iFcbgpZnw4"

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL_NAVER_API)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val api = retrofit.create(NaverAPI::class.java)
    val callGetSearchNews = api.getSearchBooks(CLIENT_ID, CLIENT_SECRET, "book","테스트")


    lateinit var bookSearchAdapter : BookSearchAdapter





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        init()
        callGetSearchNews.enqueue(object : Callback<BookData> {
            override fun onResponse(
                call: Call<BookData>,
                response: Response<BookData>
            ) {
                Log.d(TAG, "ABC성공 : ${response.raw()}")
            }

            override fun onFailure(call: Call<BookData>, t: Throwable) {
                Log.d(TAG, "ABC실패 : $t")
            }
        })
    }

    private fun init(){
        bookSearchAdapter = BookSearchAdapter(this)

    }
}