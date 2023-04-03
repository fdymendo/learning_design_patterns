package com.fdymendo.learning.designpatterns.structural.decorator.model;

public class Milk extends CoffeeDecorator {
  public Milk(Coffee coffee) {
    super(coffee);
  }

  @Override
  public double getCost() {
    return super.getCost() + 0.5;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", milk" + " costs $" + coffee.getCost();
  }
}
