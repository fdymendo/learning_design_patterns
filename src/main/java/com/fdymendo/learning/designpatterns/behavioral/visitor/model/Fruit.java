package com.fdymendo.learning.designpatterns.behavioral.visitor.model;

import com.fdymendo.learning.designpatterns.behavioral.visitor.service.ShoppingCartElement;
import com.fdymendo.learning.designpatterns.behavioral.visitor.service.ShoppingCartVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Fruit implements ShoppingCartElement {

  private String name;
  private double pricePerKg;
  private double weight;

  public void accept(ShoppingCartVisitor visitor) {
    visitor.visit(this);
  }

}
