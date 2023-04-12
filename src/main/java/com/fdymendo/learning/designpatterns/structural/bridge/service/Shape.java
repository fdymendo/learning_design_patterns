package com.fdymendo.learning.designpatterns.structural.bridge.service;

public abstract class Shape {
  protected Color color;

  protected Shape(Color color) {
    this.color = color;
  }

  public abstract String draw();
}
