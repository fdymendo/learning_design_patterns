package com.fdymendo.learning.designpatterns.behavioral.visitor.model;


public class Fruit implements ShoppingCartElement {
  private String name;
  private double pricePerKg;
  private double weight;

  public Fruit(String name, double pricePerKg, double weight) {
    this.name = name;
    this.pricePerKg = pricePerKg;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public double getPricePerKg() {
    return pricePerKg;
  }

  public double getWeight() {
    return weight;
  }

  public void accept(ShoppingCartVisitor visitor) {
    visitor.visit(this);
  }
  
}
