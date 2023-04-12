package com.fdymendo.learning.designpatterns.structural.proxy.model;

import com.fdymendo.learning.designpatterns.structural.proxy.services.ExpensiveResource;

public class ConcreteExpensiveResource implements ExpensiveResource {
  public ConcreteExpensiveResource() {
    // constructor that takes a long time to execute
  }

  public String performOperation() {
    return "ConcreteExpensiveResource";
  }
}
