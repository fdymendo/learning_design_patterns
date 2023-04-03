package com.fdymendo.learning.designpatterns.behavioral.iterator.service;

// Concrete Iterator
public class NameIterator implements Iterator {
  private String[] names;
  private int index;

  public NameIterator(String[] names) {
    this.names = names;
    this.index = 0;
  }

  public boolean hasNext() {
    return index < names.length;
  }

  public Object next() {
    if (hasNext()) {
      return names[index++];
    }
    return null;
  }
}
