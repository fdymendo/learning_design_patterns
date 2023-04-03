package com.fdymendo.learning.designpatterns.behavioral.facade.model;

public class SubsystemFacade {

  private SubsystemA subsystemA;
  private SubsystemB subsystemB;
  private SubsystemC subsystemC;

  public SubsystemFacade() {
    subsystemA = new SubsystemA();
    subsystemB = new SubsystemB();
    subsystemC = new SubsystemC();
  }

  public String initialize() {
    return "Inicializando " + this.subsystemA.toString() + " " + this.subsystemB.toString() + " "
        + this.subsystemC.toString();
  }

  public String shutdown() {
    return "Apagando " + this.subsystemA.toString() + " " + this.subsystemB.toString() + " "
        + this.subsystemC.toString();
  }

}
