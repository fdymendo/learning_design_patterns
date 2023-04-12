package com.fdymendo.learning.designpatterns.structural.decorator.model;

import com.fdymendo.learning.designpatterns.structural.decorator.service.Coffee;
import com.fdymendo.learning.designpatterns.structural.decorator.service.CoffeeDecorator;

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
