package com.fdymendo.learning.designpatterns.behavioral.visitor.model;

// Element interface
public interface ShoppingCartElement {
  void accept(ShoppingCartVisitor visitor);
}
