package com.fdymendo.learning.designpatterns.creational.abstractfactory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.service.ArtDecoFurnitureFactory;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.service.ModernFurnitureFactory;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.service.VictorianFurnitureFactory;

@RestController
@RequestMapping("/AbstractFactory")
public class AbstractFactoryController {


  @Autowired
  private ArtDecoFurnitureFactory artDecoFurnitureFactory;
  @Autowired
  private ModernFurnitureFactory modernFurnitureFactory;
  @Autowired
  private VictorianFurnitureFactory victorianFurnitureFactory;

  @PostMapping("/ArtDeco")
  public ResponseEntity<String> createArtDeco() {

    return ResponseEntity.ok(this.artDecoFurnitureFactory.toString());
  }


  @PostMapping("/Modern")
  public ResponseEntity<String> createModern() {

    return ResponseEntity.ok(this.modernFurnitureFactory.toString());
  }

  @PostMapping("/Victorian")
  public ResponseEntity<String> createVictorian() {
    return ResponseEntity.ok(this.victorianFurnitureFactory.toString());
  }
  
}
