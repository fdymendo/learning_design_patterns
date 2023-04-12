package com.fdymendo.learning.designpatterns.behavioral.visitor.service;

// Element interface
public interface ShoppingCartElement {
  void accept(ShoppingCartVisitor visitor);
}
