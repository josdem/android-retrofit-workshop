package com.josdem.retrofit

import com.josdem.retrofit.model.Category
import com.josdem.retrofit.service.FruityService
import com.josdem.retrofit.service.RetrofitHelper
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

import retrofit2.Response

const val LANGUAGE = "en"

class FruityServiceTest {

    private val fruityService: FruityService = RetrofitHelper.getInstance().create(FruityService::class.java)

    private suspend fun getCategories(): Response<List<Category>> {
        return fruityService.getCategories(LANGUAGE)
    }

    @Test
    fun shouldGetCategories() =
        runTest {
            val response = getCategories()
            val categories: List<Category>? = response.body()
            assertTrue(response.isSuccessful)
            assertEquals(4, categories?.size)
        }
}