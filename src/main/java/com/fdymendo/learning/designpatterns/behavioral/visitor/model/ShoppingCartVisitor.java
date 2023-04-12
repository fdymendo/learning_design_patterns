package com.fdymendo.learning.designpatterns.behavioral.visitor.model;

// Visitor interface
public interface ShoppingCartVisitor {
  void visit(Book book);
  void visit(Fruit fruit);
  double getTotalPrice();

}
