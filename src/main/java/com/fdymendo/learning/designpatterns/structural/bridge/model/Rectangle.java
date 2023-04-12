package com.fdymendo.learning.designpatterns.structural.bridge.model;

import com.fdymendo.learning.designpatterns.structural.bridge.service.Color;
import com.fdymendo.learning.designpatterns.structural.bridge.service.Shape;

public class Rectangle extends Shape {
  private int x;
  private int y;
  private int width;
  private int height;

  public Rectangle(int x, int y, int width, int height, Color color) {
    super(color);
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public String draw() {
    return "Drawing a rectangle at (" + x + ", " + y + "), width " + width + ", height " + height
        + ", color " + color.fill();

  }
}
