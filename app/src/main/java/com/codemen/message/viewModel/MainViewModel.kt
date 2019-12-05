package com.codemen.message.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codemen.message.Usuario
import com.codemen.message.domain.network.Repo

class MainViewModel:ViewModel() {

    private var repo = Repo()
   fun fetchUserData() : LiveData<MutableList<Usuario>>{
        val  mutableData = MutableLiveData<MutableList<Usuario>>()
       repo.getUserData().observeForever() {
            mutableData.value = it
       }
       return mutableData
    }
}