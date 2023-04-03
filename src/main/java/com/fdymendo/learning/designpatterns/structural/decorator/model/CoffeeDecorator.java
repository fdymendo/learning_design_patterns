package com.fdymendo.learning.designpatterns.structural.decorator.model;

public abstract class CoffeeDecorator implements Coffee {
  protected Coffee coffee;

  public CoffeeDecorator(Coffee coffee) {
    this.coffee = coffee;
  }

  public double getCost() {
    return coffee.getCost();
  }

  public String getDescription() {
    return coffee.getDescription();
  }
}