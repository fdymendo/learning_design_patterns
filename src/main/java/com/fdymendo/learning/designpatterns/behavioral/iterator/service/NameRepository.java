package com.fdymendo.learning.designpatterns.behavioral.iterator.service;

import com.fdymendo.learning.designpatterns.behavioral.iterator.model.NameIterator;

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
