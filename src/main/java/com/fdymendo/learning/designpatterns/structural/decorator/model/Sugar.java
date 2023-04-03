package com.fdymendo.learning.designpatterns.structural.decorator.model;

public class Sugar extends CoffeeDecorator {
  public Sugar(Coffee coffee) {
    super(coffee);
  }

  @Override
  public double getCost() {
    return super.getCost() + 0.2;
  }

  @Override
  public String getDescription() {
    return coffee.getDescription() + ", sugar" + " costs $" + coffee.getCost();
  }

}
