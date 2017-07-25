package com.jos.dem.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.jos.dem.retrofit.model.Category;
import com.jos.dem.retrofit.service.JugoterapiaService;

import java.util.List;

import retrofit2.Call;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    JugoterapiaService jugoterapiaService = JugoterapiaService.retrofit.create(JugoterapiaService.class);
    List<Category> call = jugoterapiaService.getCategories();
    for(Category category: call){
      Log.d("Category", category.getName());
    }
  }

}
