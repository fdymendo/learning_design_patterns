package com.fdymendo.learning.designpatterns.creational.factorymethod.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Warrior implements Character {
  public String attack() {
    return "Warrior attacks with a sword!";
  }

  public String defend() {
    return "Warrior defends with a shield!";
  }
}
