package com.jos.dem.retrofit.model;

public class Category {
  private Integer id;
  private String name;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "id: " + this.id + " name: " + this.name;
  }
}
