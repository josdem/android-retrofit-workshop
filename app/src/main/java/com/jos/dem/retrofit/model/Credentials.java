package com.jos.dem.retrofit.model;

public class Credentials {

  private String name;
  private String email;
  private String token;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public String toString() {
    return "name:" + this.name + " email:" + this.email + " token:" + this.token;
  }

}
