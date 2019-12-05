package com.codemen.message.domain.network

import android.content.Context.INPUT_METHOD_SERVICE
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat.getSystemService
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.codemen.message.Usuario
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Repo {

    private val API_BASE_URL = "https://jsonplaceholder.typicode.com/"

   fun getUserData(): LiveData<MutableList<Usuario>> {
        val  mutableData = MutableLiveData<MutableList<Usuario>>()



    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }



}