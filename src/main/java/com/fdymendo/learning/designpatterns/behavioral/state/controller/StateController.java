package com.fdymendo.learning.designpatterns.behavioral.state.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.behavioral.state.model.ClosedState;
import com.fdymendo.learning.designpatterns.behavioral.state.model.Door;
import com.fdymendo.learning.designpatterns.behavioral.state.model.OpenState;

@RestController
@RequestMapping("/State/v1")
public class StateController {

  private Door door;

  public StateController() {
    this.door = new Door();
  }

  @PostMapping("/Door/close")
  public String closeDoor() {
    this.door.setState(new ClosedState());
    return this.door.handle();
  }

  @PostMapping("/Door/open")
  public String openDoor() {
    this.door.setState(new OpenState());
    return this.door.handle();
  }

}
