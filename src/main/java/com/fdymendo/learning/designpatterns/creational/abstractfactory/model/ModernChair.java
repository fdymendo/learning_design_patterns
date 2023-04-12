package com.fdymendo.learning.designpatterns.creational.abstractfactory.model;

import com.fdymendo.learning.designpatterns.creational.abstractfactory.service.Chair;

public class ModernChair implements Chair {

  @Override
  public String typeChair() {
    return "ModernChair";
  }

  @Override
  public String toString() {
    return this.typeChair();
  }
}
