package com.fdymendo.learning.designpatterns.creational.abstractfactory.model;

public class VictorianChair implements Chair {

  @Override
  public String typeChair() {
    return "VictorianChair";
  }

  @Override
  public String toString() {
    return this.typeChair();
  }
  
}
