package com.fdymendo.learning.designpatterns.structural.proxy.model;

import com.fdymendo.learning.designpatterns.structural.proxy.services.ExpensiveResource;

public class ExpensiveResourceProxy implements ExpensiveResource {
  private ConcreteExpensiveResource resource;

  public String performOperation() {
    if (resource == null) {
      resource = new ConcreteExpensiveResource();
    }
    return resource.performOperation();
  }
}
