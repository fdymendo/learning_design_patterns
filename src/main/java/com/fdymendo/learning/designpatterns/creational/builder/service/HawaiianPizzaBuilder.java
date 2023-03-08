package com.fdymendo.learning.designpatterns.creational.builder.service;

import java.util.ArrayList;
import java.util.List;
import com.fdymendo.learning.designpatterns.creational.builder.model.Pizza;

public class HawaiianPizzaBuilder implements PizzaBuilder {
  
  private String size;
  private String crustType;
  private String sauceType;
  private String cheeseType;
  private List<String> toppings;

  public HawaiianPizzaBuilder() {
    this.toppings = new ArrayList<>();
  }

  public PizzaBuilder setSize(String size) {
    this.size = size;
    return this;
  }

  public PizzaBuilder setCrustType(String crustType) {
    this.crustType = crustType;
    return this;
  }

  public PizzaBuilder setSauceType(String sauceType) {
    this.sauceType = sauceType;
    return this;
  }

  public PizzaBuilder setCheeseType(String cheeseType) {
    this.cheeseType = cheeseType;
    return this;
  }

  public PizzaBuilder addTopping(String topping) {
    this.toppings.add(topping);
    return this;
  }

  public Pizza build() {
    return new Pizza(size, crustType, sauceType, cheeseType, toppings);
  }
}
