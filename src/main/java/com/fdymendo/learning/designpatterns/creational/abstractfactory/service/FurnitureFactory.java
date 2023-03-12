package com.fdymendo.learning.designpatterns.creational.abstractfactory.service;

import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.Chair;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.CoffeTable;
import com.fdymendo.learning.designpatterns.creational.abstractfactory.model.Sofa;

public interface FurnitureFactory {

  public Chair createChair();

  public CoffeTable createCoffeTable();

  public Sofa createSofa();

}
