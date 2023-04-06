package com.fdymendo.learning.designpatterns.behavioral.state.model;


public class ClosedState implements State {
  public String handle() {
    return "The door is closed.";
  }
}
