package com.fdymendo.learning.designpatterns.creational.builder.service;

import com.fdymendo.learning.designpatterns.creational.builder.model.Pizza;

public interface PizzaBuilder {
  public PizzaBuilder setSize(String size);

  public PizzaBuilder setCrustType(String crustType);

  public PizzaBuilder setSauceType(String sauceType);

  public PizzaBuilder setCheeseType(String cheeseType);

  public PizzaBuilder addTopping(String topping);

  public Pizza build();
}
