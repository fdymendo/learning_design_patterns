package com.fdymendo.learning.designpatterns.creational.factorymethod.service;

import org.springframework.stereotype.Service;
import com.fdymendo.learning.designpatterns.creational.factorymethod.model.Archer;
import com.fdymendo.learning.designpatterns.creational.factorymethod.model.Mage;
import com.fdymendo.learning.designpatterns.creational.factorymethod.model.Warrior;

@Service
public class CharacterFactory {

  public Character createCharacter(String characterType) {
    if (characterType.equals("Warrior")) {
      return new Warrior();
    } else if (characterType.equals("Mage")) {
      return new Mage();
    } else if (characterType.equals("Archer")) {
      return new Archer();
    } else {
      throw new IllegalArgumentException("Invalid character type: " + characterType);
    }
  }

}
