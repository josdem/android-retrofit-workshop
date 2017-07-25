package com.jos.dem.retrofit.service;

import com.jos.dem.retrofit.model.Category;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface JugoterapiaService {

  @GET("/jugoterapia-server/beverage/categories")
  public Call<List<Category>> getCategories();

  public static final Retrofit retrofit = new Retrofit.Builder()
          .baseUrl("http://jugoterapia.josdem.io/")
          .addConverterFactory(GsonConverterFactory.create())
          .build();

}
