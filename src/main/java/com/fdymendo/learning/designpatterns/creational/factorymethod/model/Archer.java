package com.fdymendo.learning.designpatterns.creational.factorymethod.model;

public class Archer implements Character {

  public String attack() {
    return "Archer shoots an arrow!";
  }

  public String defend() {
    return "Archer dodges attacks!";
  }
}
