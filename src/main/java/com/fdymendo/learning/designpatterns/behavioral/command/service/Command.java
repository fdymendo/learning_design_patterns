package com.fdymendo.learning.designpatterns.behavioral.command.service;

public interface Command {
  public String execute();

  public String undo();
}
