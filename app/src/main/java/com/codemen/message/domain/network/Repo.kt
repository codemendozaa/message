package com.codemen.message.domain.network

import android.content.Context.INPUT_METHOD_SERVICE
import android.util.Log
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat.getSystemService
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.codemen.message.Usuario
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Repo {

    private val API_BASE_URL = "https://jsonplaceholder.typicode.com/"
    lateinit var service: ApiClient
    val TAG_LOGS = "API"

    fun getUserData(): LiveData<MutableList<Usuario>> {
        val mutableData = MutableLiveData<MutableList<Usuario>>()

        service = getRetrofit().create<ApiClient>(ApiClient::class.java)
        fun onResponse(call: Call<List<Usuario>>?, response: Response<List<Usuario>>?) {
            val posts = response?.body()
            response.forEach { it ->
                val Userid:Int = it.getInt()
                val id:Int = it.getInt()
                val title :String = it.getString("title")
                val body :String = it.getString ("body")
            }
            mutableData.value = posts as MutableList<Usuario>?
            Log.i(TAG_LOGS, Gson().toJson(posts))
        }

        return mutableData
    }




    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}

private fun <T> Response<T>?.forEach(any: Any) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
