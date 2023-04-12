package com.fdymendo.learning.designpatterns.structural.bridge.model;

import com.fdymendo.learning.designpatterns.structural.bridge.service.Color;
import com.fdymendo.learning.designpatterns.structural.bridge.service.Shape;

public class Circle extends Shape {
  private int x;
  private int y;
  private int radius;

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
