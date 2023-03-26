package com.fdymendo.learning.designpatterns.creational.proxy.services;

public class ExpensiveResourceProxy implements ExpensiveResource {
  private ConcreteExpensiveResource resource;

  public String performOperation() {
    if (resource == null) {
      resource = new ConcreteExpensiveResource();
    }
    return resource.performOperation();
  }
}
