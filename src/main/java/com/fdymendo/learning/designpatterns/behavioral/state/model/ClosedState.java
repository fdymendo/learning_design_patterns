package com.fdymendo.learning.designpatterns.behavioral.state.model;

import com.fdymendo.learning.designpatterns.behavioral.state.service.State;

public class ClosedState implements State {

  public String handle() {
    return "The door is closed.";
  }

}
