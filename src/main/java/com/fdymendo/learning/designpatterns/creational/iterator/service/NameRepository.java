package com.fdymendo.learning.designpatterns.creational.iterator.service;

// Concrete Aggregate
public class NameRepository implements Aggregate {
  private String[] names;

  public NameRepository(String[] names) {
    this.names = names;
  }

  public Iterator createIterator() {
    return new NameIterator(names);
  }
}
