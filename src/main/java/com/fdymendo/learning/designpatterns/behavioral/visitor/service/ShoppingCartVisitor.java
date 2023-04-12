package com.fdymendo.learning.designpatterns.behavioral.visitor.service;

import com.fdymendo.learning.designpatterns.behavioral.visitor.model.Book;
import com.fdymendo.learning.designpatterns.behavioral.visitor.model.Fruit;

// Visitor interface
public interface ShoppingCartVisitor {
  void visit(Book book);

  void visit(Fruit fruit);

  double getTotalPrice();

}
