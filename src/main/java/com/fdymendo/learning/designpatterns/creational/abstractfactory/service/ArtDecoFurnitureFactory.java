package com.fdymendo.learning.designpatterns.creational.abstractfactory.service;

import org.springframework.stereotype.Service;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.ArtDecoChair;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.ArtDecoCoffeTable;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.ArtDecoSofa;

@Service
public class ArtDecoFurnitureFactory {

  public Chair createChair() {
    return new ArtDecoChair();
  }

  public CoffeTable createCoffeTable() {
    return new ArtDecoCoffeTable();
  }

  public Sofa createSofa() {
    return new ArtDecoSofa();
  }

  @Override
  public String toString() {
    return this.createChair() + " " + this.createCoffeTable() + " " + this.createSofa();
  }

}
