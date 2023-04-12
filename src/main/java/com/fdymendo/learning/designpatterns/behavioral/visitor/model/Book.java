package com.fdymendo.learning.designpatterns.behavioral.visitor.model;

import com.fdymendo.learning.designpatterns.behavioral.visitor.service.ShoppingCartElement;
import com.fdymendo.learning.designpatterns.behavioral.visitor.service.ShoppingCartVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;

// Concrete element classes
@Data
@AllArgsConstructor
public class Book implements ShoppingCartElement {

  private String title;
  private double price;

  public void accept(ShoppingCartVisitor visitor) {
    visitor.visit(this);
  }
}
