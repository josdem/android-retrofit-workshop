package com.jos.dem.retrofit.service;

import com.jos.dem.retrofit.model.Category;
import com.jos.dem.retrofit.model.Credentials;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface JugoterapiaService {

  @GET("/jugoterapia-server/beverage/categories")
  public Call<List<Category>> getCategories();

  @Headers("Content-Type: application/json")
  @POST("http://192.168.43.233:8080/auth/validate")
  public Call<Credentials> sendCredentials(@Body Credentials credentials);

  public static final Retrofit retrofit = new Retrofit.Builder()
          .baseUrl("http://jugoterapia.josdem.io/")
          .addConverterFactory(GsonConverterFactory.create())
          .build();

}
