package com.example.retrofitbooksearch

import retrofit2.Call
import retrofit2.http.*

interface NaverAPI {

    //책 내용 get
    @GET("v1/search/book.json")
    fun getSearchBooks(
        @Header("X-Naver-Client-Id") clientId: String,
        @Header("X-Naver-Client-Secret") clientSecret: String,
        @Query("serviceid") serviceid :String,
        @Query("query") query : String,
        @Query("display") display : Int? = null, //출력건수
        @Query("start") start: Int? = null

    ): Call<BookData>
}