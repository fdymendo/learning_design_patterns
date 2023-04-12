package com.fdymendo.learning.designpatterns.behavioral.visitor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.behavioral.visitor.model.Book;
import com.fdymendo.learning.designpatterns.behavioral.visitor.model.Fruit;
import com.fdymendo.learning.designpatterns.behavioral.visitor.model.ShoppingCartVisitorImpl;
import com.fdymendo.learning.designpatterns.behavioral.visitor.service.ShoppingCartElement;
import com.fdymendo.learning.designpatterns.behavioral.visitor.service.ShoppingCartVisitor;

@RestController
@RequestMapping("/Visitor/v1")
public class VisitorController {

  @GetMapping("/ShoppingCart/Value")
  public String shoppingCart() {
    ShoppingCartElement[] items = new ShoppingCartElement[] {new Book("Design Patterns", 29.99),
        new Fruit("Apple", 1.99, 2.5), new Fruit("Banana", 0.99, 1.5)};

    ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
    for (ShoppingCartElement item : items) {
      item.accept(visitor);
    }

    return "Total price: " + visitor.getTotalPrice();
  }

}
