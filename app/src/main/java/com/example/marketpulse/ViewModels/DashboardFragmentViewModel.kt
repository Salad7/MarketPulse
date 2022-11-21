package com.example.marketpulse.ViewModels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.marketpulse.api
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

class DashboardFragmentViewModel : ViewModel() {

    lateinit var api :api
    var retrofit = Retrofit.Builder()
        .baseUrl("https://api.coindesk.com/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    init {
        viewModelScope.launch {
            api = retrofit.create()
            Log.d("Dashboard","Bitcoin Response: "+api.getBitcoinPrice().toString())
        }
    }
}