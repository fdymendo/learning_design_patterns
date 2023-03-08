package com.fdymendo.learning.designpatterns.creational.builder.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fdymendo.learning.designpatterns.creational.builder.model.Pizza;
import com.fdymendo.learning.designpatterns.creational.builder.service.Director;
import com.fdymendo.learning.designpatterns.creational.builder.service.HawaiianPizzaBuilder;

@Controller
@RequestMapping("/Builder")
public class BuilderController {


  @PostMapping("/HawaiianPizza")
  public ResponseEntity<Pizza> getCar() {
    HawaiianPizzaBuilder builder = new HawaiianPizzaBuilder();
    Director director = new Director();
    director.makeHawaiianPizza(builder);

    Pizza pizza = builder.build();

    return ResponseEntity.ok(pizza);
  }
}
