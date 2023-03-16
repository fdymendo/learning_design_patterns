package com.fdymendo.learning.designpatterns.creational.bridge.model;

public class Rectangle extends Shape {
  private int x, y, width, height;

  public Rectangle(int x, int y, int width, int height, Color color) {
    super(color);
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public String draw() {
    return "Drawing a rectangle at (" + x + ", " + y + "), width " + width + ", height " + height +", color "+ color.fill();
   
  }
}
