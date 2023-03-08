package com.fdymendo.learning.designpatterns.creational.factorymethod.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Mage implements Character {
  public String attack() {
    return "Mage casts a spell!";
  }

  public String defend() {
    return "Mage uses a magical shield!";
  }
}
