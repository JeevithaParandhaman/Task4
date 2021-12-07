package com.example.task4

import retrofit2.http.GET

interface ApiInterface {
    @GET("books")
    suspend fun getBooks():List<Books>

}