package com.fdymendo.learning.designpatterns.creational.factorymethod.model;

import com.fdymendo.learning.designpatterns.creational.factorymethod.service.Character;

public class Archer implements Character {

  public String attack() {
    return "Archer shoots an arrow!";
  }

  public String defend() {
    return "Archer dodges attacks!";
  }
}
