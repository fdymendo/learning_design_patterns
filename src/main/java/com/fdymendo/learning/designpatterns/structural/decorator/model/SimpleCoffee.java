package com.fdymendo.learning.designpatterns.structural.decorator.model;

import com.fdymendo.learning.designpatterns.structural.decorator.service.Coffee;

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
