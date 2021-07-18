package com.example.retrofitbooksearch

import com.google.gson.annotations.SerializedName

////책 이미지랑 타이틀, 내용 get
//data class BookData(
//    @SerializedName("bookImg") var bookImg : String = "",
//    @SerializedName("bookTitle") var bookTitle : String = "",
//    @SerializedName("bookDetail") var bookDetail : String = ""
//)
//
////책 검색 post
//data class BookItem(
//    @SerializedName("query") var query : String = "",
//    @SerializedName("start") var start : Int = 0,
//    @SerializedName("display") var display : Int = 10,
//    @SerializedName("items") var items : List<BookData>
//)


//책 이미지랑 타이틀, 내용 get
data class BookData (
    var lastBuildDate: String = "",
    var total: Int = 0,
    var start: Int = 0,
    var display: Int = 0,
    var items: List<Items>
)

data class Items(
    var title: String = "",
    var link: String = "",
    var image: String = "",
    var author: String = "",
    var price: String = "",
    var discount : String = "",
    var publisher : String = "",
    var pubdate : String = "",
    var isbn : String = "",
    var description : String = "",
)