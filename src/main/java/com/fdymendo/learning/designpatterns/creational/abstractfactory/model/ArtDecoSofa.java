package com.fdymendo.learning.designpatterns.creational.abstractfactory.model;

import com.fdymendo.learning.designpatterns.creational.abstractfactory.service.Sofa;

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
