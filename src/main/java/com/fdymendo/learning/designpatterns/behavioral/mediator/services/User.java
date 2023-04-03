package com.fdymendo.learning.designpatterns.behavioral.mediator.services;

import lombok.extern.log4j.Log4j2;

@Log4j2
// Concrete Colleague
public class User implements Colleague {
  private String name;
  private Mediator mediator;

  public User(String name, Mediator mediator) {
    this.name = name;
    this.mediator = mediator;
  }

  public String sendMessage(String message) {
    log.info(name + " sends message: " + message);
    return mediator.sendMessage(message, this);
  }

  public void receiveMessage(String message) {
    log.info(name + " receives message: " + message);

  }
}
