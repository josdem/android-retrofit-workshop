package com.josdem.retrofit

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.josdem.retrofit.service.FruityService
import com.josdem.retrofit.service.RetrofitHelper
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import java.util.Locale

class MainActivity : ComponentActivity() {

    private val language: String = Locale.getDefault().language

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fruityService = RetrofitHelper.getInstance().create(FruityService::class.java)

        MainScope().launch {
            val result = fruityService.getCategories(language)
            Log.d("categories: ", result.body().toString())
        }
    }
}