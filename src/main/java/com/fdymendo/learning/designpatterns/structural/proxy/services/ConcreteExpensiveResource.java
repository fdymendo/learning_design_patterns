package com.fdymendo.learning.designpatterns.structural.proxy.services;

public class ConcreteExpensiveResource implements ExpensiveResource {
  public ConcreteExpensiveResource() {
    // constructor that takes a long time to execute
  }

  public String performOperation() {
    return "ConcreteExpensiveResource";
  }
}
