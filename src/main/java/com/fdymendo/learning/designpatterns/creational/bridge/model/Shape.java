package com.fdymendo.learning.designpatterns.creational.bridge.model;

public abstract class Shape {
  protected Color color;

  protected Shape(Color color) {
    this.color = color;
  } 

  public abstract String draw();
}
