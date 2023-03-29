package com.fdymendo.learning.designpatterns.creational.command.model;


// Invoker Object
public class RemoteControl {
  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public String pressButton() {
    return command.execute();
  }

  public String pressUndoButton() {
    return command.undo();
  }

}
