package com.fdymendo.learning.designpatterns.creational.abstractfactory.model;

public class VictorianCoffeTable implements CoffeTable {

  @Override
  public String typeCoffeTable() {
    return "VictorianCoffeTable";
  }

  @Override
  public String toString() {
    return this.typeCoffeTable();
  }
}
