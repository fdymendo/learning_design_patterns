package com.fdymendo.learning.designpatterns.creational.abstractfactory.model;

public class ModernSofa implements Sofa {

  @Override
  public String typeSofa() {
    return "ModernSofa";
  }

  @Override
  public String toString() {
    return this.typeSofa();
  }
}
