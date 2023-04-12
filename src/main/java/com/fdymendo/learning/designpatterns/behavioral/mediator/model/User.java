package com.fdymendo.learning.designpatterns.behavioral.mediator.model;

import com.fdymendo.learning.designpatterns.behavioral.mediator.services.Colleague;
import com.fdymendo.learning.designpatterns.behavioral.mediator.services.Mediator;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
// Concrete Colleague
public class User implements Colleague {

  private String name;
  private Mediator mediator;

  public String sendMessage(String message) {
    log.info(name + " sends message: " + message);
    return mediator.sendMessage(message, this);
  }

  public void receiveMessage(String message) {
    log.info(name + " receives message: " + message);

  }
}
