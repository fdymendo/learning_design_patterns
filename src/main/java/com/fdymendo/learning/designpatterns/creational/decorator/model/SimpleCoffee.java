package com.fdymendo.learning.designpatterns.creational.decorator.model;

public class SimpleCoffee implements Coffee {

  @Override
  public double getCost() {
    return 1.0;
  }

  @Override
  public String getDescription() {
    return "Simple coffee";
  }
}
