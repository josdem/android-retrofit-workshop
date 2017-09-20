package com.jos.dem.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.jos.dem.retrofit.model.Category;
import com.jos.dem.retrofit.model.Credentials;
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

    Credentials credentials = createCredentials();

    Call<Credentials> call = jugoterapiaService.sendCredentials(credentials);
    call.enqueue(new Callback<Credentials>() {

      @Override
      public void onResponse(Call<Credentials> call, Response<Credentials> response) {
        Log.d("credentials:", response.body().toString());
      }

      @Override
      public void onFailure(Call<Credentials> call, Throwable t) {
        Log.d("error", t.getMessage());
      }
    });

  }

  private Credentials createCredentials() {
    Credentials credentials = new Credentials();
    credentials.setName("josdem");
    credentials.setEmail("joseluis.delacruz@gmail.com");
    credentials.setToken("token");
    return credentials;
  }

}
