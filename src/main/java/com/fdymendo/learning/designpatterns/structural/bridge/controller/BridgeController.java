package com.fdymendo.learning.designpatterns.structural.bridge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.structural.bridge.model.Circle;
import com.fdymendo.learning.designpatterns.structural.bridge.model.Green;
import com.fdymendo.learning.designpatterns.structural.bridge.model.Rectangle;
import com.fdymendo.learning.designpatterns.structural.bridge.model.Red;

@RestController
@RequestMapping("/Bridge/v1")
public class BridgeController {


  @GetMapping("/Circle")
  public String getCircle() {
    return new Circle(10, 10, 5, new Red()).draw();
  }


  @GetMapping("/Rectagle")
  public String getRectangle() {
    return new Rectangle(20, 20, 10, 5, new Green()).draw();
  }

}
