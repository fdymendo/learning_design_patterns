package com.fdymendo.learning.designpatterns.structural.flyweight.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Point {
  
  private int x;
  private int y;

  public String draw() {
    // draw the point on a canvas
    return "point: x: " + this.x + " y: " + this.y;
  }
}
