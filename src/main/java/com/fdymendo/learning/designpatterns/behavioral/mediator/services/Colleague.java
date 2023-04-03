package com.fdymendo.learning.designpatterns.behavioral.mediator.services;

// Colleague Interface
public interface Colleague {
  public String sendMessage(String message);

  public void receiveMessage(String message);
}
