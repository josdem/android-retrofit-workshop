package com.josdem.retrofit.service

import com.josdem.retrofit.model.Beverage
import com.josdem.retrofit.model.Category
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface FruityService {
    @GET("/categories/{language}")
    suspend fun getCategories(
        @Path("language") language: String,
    ): Response<List<Category>>

    @GET("/categories/{categoryId}/beverages")
    suspend fun getBeverages(
        @Path("categoryId") id: Int,
    ): Response<List<Beverage>>

    @GET("/beverages/{beverageId}")
    suspend fun getBeverage(
        @Path("beverageId") id: Int,
    ): Response<Beverage>
}