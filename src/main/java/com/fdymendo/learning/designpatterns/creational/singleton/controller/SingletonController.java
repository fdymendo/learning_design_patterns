package com.fdymendo.learning.designpatterns.creational.singleton.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.creational.singleton.model.Singleton;

@RestController
@RequestMapping("/Singleton/v1")
public class SingletonController {

  @GetMapping("/Singleton")
  public ResponseEntity<String> getSingleton() {
    Singleton singleton = Singleton.getInstance();
    return ResponseEntity.ok(singleton.toString());
  }

}
