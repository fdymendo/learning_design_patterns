package com.fdymendo.learning.designpatterns.creational.abstractfactory.model;

import com.fdymendo.learning.designpatterns.creational.abstractfactory.service.CoffeTable;

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
