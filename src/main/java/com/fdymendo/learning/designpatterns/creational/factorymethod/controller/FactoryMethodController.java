package com.fdymendo.learning.designpatterns.creational.factorymethod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.creational.factorymethod.model.Character;
import com.fdymendo.learning.designpatterns.creational.factorymethod.service.CharacterFactory;

@RestController
@RequestMapping("/FactoryMethod/v1")
public class FactoryMethodController {

  @Autowired
  private CharacterFactory characterFactory;

  @PostMapping("/{type}")
  public ResponseEntity<String> createProductShip(@PathVariable String type) {
    Character character = this.characterFactory.createCharacter(type);
    return ResponseEntity.ok(character.attack() + " " + character.defend());
  }

}
