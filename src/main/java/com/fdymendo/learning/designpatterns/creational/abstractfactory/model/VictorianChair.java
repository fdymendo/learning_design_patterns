package com.fdymendo.learning.designpatterns.creational.abstractfactory.model;

import com.fdymendo.learning.designpatterns.creational.abstractfactory.service.Chair;

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
