package com.fdymendo.learning.designpatterns.creational.abstractfactory.model;

import com.fdymendo.learning.designpatterns.creational.abstractfactory.service.Sofa;

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
