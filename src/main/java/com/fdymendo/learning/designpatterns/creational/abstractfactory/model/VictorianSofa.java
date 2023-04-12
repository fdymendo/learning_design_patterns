package com.fdymendo.learning.designpatterns.creational.abstractfactory.model;

import com.fdymendo.learning.designpatterns.creational.abstractfactory.service.Sofa;

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
