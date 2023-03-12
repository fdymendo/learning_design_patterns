package com.fdymendo.learning.designpatterns.creational.abstractfactory.model;

public class ArtDecoChair implements Chair {

  @Override
  public String typeChair() {
    return "ArtDecoChair";
  }

  @Override
  public String toString() {
    return this.typeChair();
  }
}
