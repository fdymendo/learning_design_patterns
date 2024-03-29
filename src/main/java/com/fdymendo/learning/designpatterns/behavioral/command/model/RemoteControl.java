package com.fdymendo.learning.designpatterns.behavioral.command.model;

import com.fdymendo.learning.designpatterns.behavioral.command.service.Command;

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
