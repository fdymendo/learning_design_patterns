package com.fdymendo.learning.designpatterns.behavioral.strategy.model;

import java.util.ArrayList;
import java.util.List;

// Context class
public class ShoppingCart {
  private List<Item> items;
  private PaymentStrategy paymentStrategy;

  public ShoppingCart() {
    items = new ArrayList<Item>();
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public void removeItem(Item item) {
    items.remove(item);
  }

  public double calculateTotal() {
    double total = 0.0;
    for (Item item : items) {
      total += item.getPrice();
    }
    return total;
  }

  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public String pay() {
    double total = calculateTotal();
    return paymentStrategy.pay(total);
  }
}
