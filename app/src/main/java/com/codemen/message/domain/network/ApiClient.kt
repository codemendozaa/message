package com.codemen.message.domain.network

import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object ApiClient {

    interface ServicesApiInterface{
        @GET("/posts")
            fun getPost(): Call<List<PostResponse>>
    }


}
