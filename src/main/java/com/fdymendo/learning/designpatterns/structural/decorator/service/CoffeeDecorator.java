package com.fdymendo.learning.designpatterns.structural.decorator.service;

public abstract class CoffeeDecorator implements Coffee {
  
  protected Coffee coffee;

  protected CoffeeDecorator(Coffee coffee) {
    this.coffee = coffee;
  }

  public double getCost() {
    return coffee.getCost();
  }

  public String getDescription() {
    return coffee.getDescription();
  }
}
