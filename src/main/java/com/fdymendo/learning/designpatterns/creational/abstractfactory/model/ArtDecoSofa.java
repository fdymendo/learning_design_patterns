package com.fdymendo.learning.designpatterns.creational.abstractfactory.model;

public class ArtDecoSofa implements Sofa {

  @Override
  public String typeSofa() {
    return "ArtDecoSofa";
  }

  @Override
  public String toString() {
    return this.typeSofa();
  }
}
