package com.fdymendo.learning.designpatterns.creational.abstractfactory.model;

import com.fdymendo.learning.designpatterns.creational.abstractfactory.service.CoffeTable;

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
