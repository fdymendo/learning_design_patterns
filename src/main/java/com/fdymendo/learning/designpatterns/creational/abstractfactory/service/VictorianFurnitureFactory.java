package com.fdymendo.learning.designpatterns.creational.abstractfactory.service;

import org.springframework.stereotype.Service;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.Chair;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.CoffeTable;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.Sofa;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.VictorianChair;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.VictorianCoffeTable;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.VictorianSofa;

@Service
public class VictorianFurnitureFactory implements FurnitureFactory {

  public Chair createChair() {
    return new VictorianChair();
  }

  public CoffeTable createCoffeTable() {
    return new VictorianCoffeTable();
  }

  public Sofa createSofa() {
    return new VictorianSofa();
  }

  @Override
  public String toString() {
    return this.createChair() + " " + this.createCoffeTable() + " " + this.createSofa();
  }

}
