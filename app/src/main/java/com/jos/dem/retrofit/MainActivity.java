package com.jos.dem.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.jos.dem.retrofit.model.Category;
import com.jos.dem.retrofit.service.JugoterapiaService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    JugoterapiaService jugoterapiaService = JugoterapiaService.retrofit.create(JugoterapiaService.class);
    Call<List<Category>> call = jugoterapiaService.getCategories();
    call.enqueue(new Callback<List<Category>>() {

      @Override
      public void onResponse(Call<List<Category>> call, Response<List<Category>> response) {
        for(Category category: response.body()){
          Log.d("category", category.toString());
        }
      }

      @Override
      public void onFailure(Call<List<Category>> call, Throwable t) {
        Log.d("error", t.getMessage());
      }
    });

  }

}
