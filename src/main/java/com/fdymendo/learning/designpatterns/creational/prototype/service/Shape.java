package com.fdymendo.learning.designpatterns.creational.prototype.service;

// Define the prototype class
public abstract class Shape implements Cloneable {
  private String type;

  // Define the abstract method for drawing the shape
  public abstract String draw();

  // Define the clone method to create a copy of the object
  public Object clone() {
    Object clone = null;
    try {
      clone = super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return clone;
  }

  // Define the getter and setter methods for the type field
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
