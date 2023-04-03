package com.fdymendo.learning.designpatterns.behavioral.command.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.behavioral.command.model.Light;
import com.fdymendo.learning.designpatterns.behavioral.command.model.LightOnCommand;
import com.fdymendo.learning.designpatterns.behavioral.command.model.RemoteControl;

@RestController
@RequestMapping("/Command/v1")
public class CommandController {


  @GetMapping("/Execute")
  public String executeButton() {
    Light light = new Light();
    LightOnCommand lightOnCommand = new LightOnCommand(light);
    RemoteControl remote = new RemoteControl();
    remote.setCommand(lightOnCommand);

    return remote.pressButton(); // Light turned on.
  }

  @GetMapping("/Undo")
  public String undoButton() {
    Light light = new Light();
    LightOnCommand lightOnCommand = new LightOnCommand(light);
    RemoteControl remote = new RemoteControl();
    remote.setCommand(lightOnCommand);

    return remote.pressUndoButton(); // Light turned on.
  }
}
