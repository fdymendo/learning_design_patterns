package com.fdymendo.learning.designpatterns.structural.decorator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.structural.decorator.model.Milk;
import com.fdymendo.learning.designpatterns.structural.decorator.model.SimpleCoffee;
import com.fdymendo.learning.designpatterns.structural.decorator.model.Sugar;
import com.fdymendo.learning.designpatterns.structural.decorator.service.Coffee;

@RestController
@RequestMapping("/Decorator/v1")
public class DecoratorController {


  @GetMapping("/Milk")
  public String getMilk() {
    Coffee coffee = new SimpleCoffee();
    coffee = new Milk(coffee);
    return coffee.getDescription();

  }

  @GetMapping("/Sugar")
  public String getSugar() {
    Coffee coffee = new SimpleCoffee();
    coffee = new Sugar(coffee);
    return coffee.getDescription();

  }
}
