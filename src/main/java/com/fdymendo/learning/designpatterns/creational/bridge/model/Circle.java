package com.fdymendo.learning.designpatterns.creational.bridge.model;

public class Circle extends Shape {
  private int x, y, radius;

  public Circle(int x, int y, int radius, Color color) {
    super(color);
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  public String draw() {
    return "Drawing a circle at (" + x + ", " + y + "), radius " + radius + ", color: "
        + color.fill();
  }
}
