package com.fdymendo.learning.designpatterns.creational.singleton.model;

import java.util.UUID;

public class Singleton {

  private static Singleton instance;
  private String random = UUID.randomUUID().toString();

  @Override
  public String toString() {
    return this.random;
  }

  // Private constructor to prevent direct instantiation
  private Singleton() {
    // Initialization code here...
  }

  // Static method to return the singleton instance
  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  // Other methods and variables...
}
