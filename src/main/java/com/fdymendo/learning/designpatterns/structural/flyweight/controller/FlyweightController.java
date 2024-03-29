package com.fdymendo.learning.designpatterns.structural.flyweight.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.structural.flyweight.model.Point;
import com.fdymendo.learning.designpatterns.structural.flyweight.service.PointFactory;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/Flyweight/v1")
public class FlyweightController {

  private PointFactory pointFactory;

  public FlyweightController(PointFactory pointFactory) {
    this.pointFactory = pointFactory;
  }

  @GetMapping("/GetPoint")
  public String getPoint() {
    Point p1 = this.pointFactory.getPoint(0, 0);
    Point p2 = this.pointFactory.getPoint(1, 1);
    Point p3 = this.pointFactory.getPoint(0, 0);

    log.info(p1 == p2); // false
    log.info(p1 == p3); // true

    return p3.draw();
  }
}
