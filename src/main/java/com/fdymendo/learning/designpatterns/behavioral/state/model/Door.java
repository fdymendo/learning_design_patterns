package com.fdymendo.learning.designpatterns.behavioral.state.model;

// Context class
public class Door {
  private State state;

  public Door() {
    state = new ClosedState();
  }

  public void setState(State state) {
    this.state = state;
  }

  public String handle() {
    return state.handle();
  }
  
}
