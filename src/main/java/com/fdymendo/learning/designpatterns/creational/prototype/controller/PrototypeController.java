package com.fdymendo.learning.designpatterns.creational.prototype.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.creational.prototype.model.Circle;
import com.fdymendo.learning.designpatterns.creational.prototype.model.Rectangle;

@RestController
@RequestMapping("/Prototype/v1")
public class PrototypeController {

  @GetMapping("/Circle")
  public ResponseEntity<String> getCloneCircle() {
    // Create a new rectangle object
    Circle circle = new Circle();
    // Clone the rectangle object to create a new one
    Circle clonedCircle = (Circle) circle.clone();
    // Change the type of the cloned object
    clonedCircle.setType("clonedCircle");

    return ResponseEntity.ok(clonedCircle.getType());
  }

  @GetMapping("/Rectangle")
  public ResponseEntity<String> getCloneRectangle() {
    // Create a new rectangle object
    Rectangle rectangle = new Rectangle();
    // Clone the rectangle object to create a new one
    Rectangle clonedRectangle = (Rectangle) rectangle.clone();
    // Change the type of the cloned object
    clonedRectangle.setType("clonedRectangle");

    return ResponseEntity.ok(clonedRectangle.getType());
  }
}
