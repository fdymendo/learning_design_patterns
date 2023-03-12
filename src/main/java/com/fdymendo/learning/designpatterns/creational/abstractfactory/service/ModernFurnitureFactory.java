package com.fdymendo.learning.designpatterns.creational.abstractfactory.service;

import org.springframework.stereotype.Service;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.Chair;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.CoffeTable;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.ModernChair;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.ModernCoffeTable;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.ModernSofa;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.Sofa;

@Service
public class ModernFurnitureFactory implements FurnitureFactory {
  public Chair createChair() {
    return new ModernChair();
  }

  public CoffeTable createCoffeTable() {
    return new ModernCoffeTable();
  }

  public Sofa createSofa() {
    return new ModernSofa();
  }

  @Override
  public String toString() {
    return this.createChair() + " " + this.createCoffeTable() + " " + this.createSofa();
  }

}
