package com.fdymendo.learning.designpatterns.creational.prototype.model;

import com.fdymendo.learning.designpatterns.creational.prototype.service.Shape;


public class Circle extends Shape {
  public Circle() {
    setType("Circle");
  }

  public String draw() {
    return "Drawing a circle";
  }
}
