package com.fdymendo.learning.designpatterns.behavioral.command.model;

// Concrete Command
public class LightOnCommand implements Command {
  private Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  public String execute() {
    return light.turnOn();
  }

  public String undo() {
    return light.turnOff();
  }
}
