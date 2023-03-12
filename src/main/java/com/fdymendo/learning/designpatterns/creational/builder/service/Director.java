package com.fdymendo.learning.designpatterns.creational.builder.service;

public class Director {
  
  public void makeHawaiianPizza(PizzaBuilder builder) {
      builder.setSize("Large");
      builder.setCrustType("Thin");
      builder.setSauceType("Tomato");
      builder.setCheeseType("Mozzarella");
      builder.addTopping("Ham");
      builder.addTopping("Pineapple");
  }
  
}
