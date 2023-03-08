package com.fdymendo.learning.designpatterns.creational.abstractfactory.model;

public class VictorianSofa implements Sofa {

  @Override
  public String typeSofa() {
    return "VictorianSofa";
  }

  @Override
  public String toString() {
    return this.typeSofa();
  }
}
