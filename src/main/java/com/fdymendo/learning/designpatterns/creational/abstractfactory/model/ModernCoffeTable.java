package com.fdymendo.learning.designpatterns.creational.abstractfactory.model;

public class ModernCoffeTable implements CoffeTable {

  @Override
  public String typeCoffeTable() {
    return "ModernCoffeTable";
  }

  @Override
  public String toString() {
    return this.typeCoffeTable();
  }
}
