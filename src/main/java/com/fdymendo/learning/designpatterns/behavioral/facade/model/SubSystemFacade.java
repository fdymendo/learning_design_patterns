package com.fdymendo.learning.designpatterns.behavioral.facade.model;

public class SubSystemFacade {

  private SubSystemA subSystemA;
  private SubSystemB subSystemB;
  private SubSystemC subsystemC;

  public SubSystemFacade() {
    subSystemA = new SubSystemA();
    subSystemB = new SubSystemB();
    subsystemC = new SubSystemC();
  }

  public String initialize() {
    return "Inicializando " + this.subSystemA.toString() + " " + this.subSystemB.toString() + " "
        + this.subsystemC.toString();
  }

  public String shutdown() {
    return "Apagando " + this.subSystemA.toString() + " " + this.subSystemB.toString() + " "
        + this.subsystemC.toString();
  }

}
