package com.fdymendo.learning.designpatterns.behavioral.state.model;

import com.fdymendo.learning.designpatterns.behavioral.state.service.State;
import lombok.Data;

// Context class
@Data
public class Door {

  private State state;

  public Door() {
    state = new ClosedState();
  }

  public String handle() {
    return state.handle();
  }

}
