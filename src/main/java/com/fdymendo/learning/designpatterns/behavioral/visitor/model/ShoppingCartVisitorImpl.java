package com.fdymendo.learning.designpatterns.behavioral.visitor.model;

import com.fdymendo.learning.designpatterns.behavioral.visitor.service.ShoppingCartVisitor;
import lombok.Getter;
import lombok.NoArgsConstructor;

// Concrete visitor classes
@NoArgsConstructor
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

  @Getter
  private double totalPrice = 0;

  public void visit(Book book) {
    totalPrice += book.getPrice();
  }

  public void visit(Fruit fruit) {
    totalPrice += (fruit.getPricePerKg() * fruit.getWeight());
  }

}
