package com.fdymendo.learning.designpatterns.creational.prototype.model;

import com.fdymendo.learning.designpatterns.creational.prototype.service.Shape;

public class Rectangle extends Shape {
  
  public Rectangle() {
    setType("Rectangle");
  }

  public String draw() {
    return "Drawing a rectangle";
  }
}
