package com.fdymendo.learning.designpatterns.creational.composite.service;

public class File implements Component {
  private String name;
  private int size;

  public File(String name, int size) {
    this.name = name;
    this.size = size;
  }

  public String showDetails() {
    return "File name: " + name + ", Size: " + size + " KB";
  }
  
}
