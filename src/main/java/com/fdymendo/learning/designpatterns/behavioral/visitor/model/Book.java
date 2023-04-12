package com.fdymendo.learning.designpatterns.behavioral.visitor.model;


// Concrete element classes
public class Book implements ShoppingCartElement {
  private String title;
  private double price;

  public Book(String title, double price) {
    this.title = title;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public double getPrice() {
    return price;
  }

  public void accept(ShoppingCartVisitor visitor) {
    visitor.visit(this);
  }
}
