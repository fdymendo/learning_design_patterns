package com.fdymendo.learning.designpatterns.behavioral.visitor.model;

// Concrete visitor classes
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
  private double totalPrice = 0;

  public void visit(Book book) {
    totalPrice += book.getPrice();
  }

  public void visit(Fruit fruit) {
    totalPrice += (fruit.getPricePerKg() * fruit.getWeight());
  }

  public double getTotalPrice() {
    return totalPrice;
  }
}
