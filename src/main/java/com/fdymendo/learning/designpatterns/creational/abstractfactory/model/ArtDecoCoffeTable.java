package com.fdymendo.learning.designpatterns.creational.abstractfactory.model;

public class ArtDecoCoffeTable implements CoffeTable {

  @Override
  public String typeCoffeTable() {
    return "ArtDecoCoffeTable";
  }

  @Override
  public String toString() {
    return this.typeCoffeTable();
  }
}
