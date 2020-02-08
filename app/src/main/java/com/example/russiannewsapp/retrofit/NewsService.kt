package com.example.russiannewsapp.retrofit

import com.example.russiannewsapp.model.NewsWebsite
import retrofit2.Call
import retrofit2.http.GET

interface NewsService {

@get : GET("v2/sources?country=ru&apiKey=e6d7188a10a34f8aaf4f130346a337d5")
val sources: Call<NewsWebsite>

}