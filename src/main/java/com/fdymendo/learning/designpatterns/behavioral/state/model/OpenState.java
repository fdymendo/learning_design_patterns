package com.fdymendo.learning.designpatterns.behavioral.state.model;

import com.fdymendo.learning.designpatterns.behavioral.state.service.State;

// Concrete state classes
public class OpenState implements State {
  public String handle() {
    return "The door is open.";
  }
}
