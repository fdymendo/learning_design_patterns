package com.fdymendo.learning.designpatterns.behavioral.state.model;

// Concrete state classes
public class OpenState implements State {
  public String handle() {
    return "The door is open.";
  }
}
