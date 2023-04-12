package com.fdymendo.learning.designpatterns.creational.abstractfactory.model;

import com.fdymendo.learning.designpatterns.creational.abstractfactory.service.CoffeTable;

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
