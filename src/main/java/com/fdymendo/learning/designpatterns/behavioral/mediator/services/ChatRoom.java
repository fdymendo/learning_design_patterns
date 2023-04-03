package com.fdymendo.learning.designpatterns.behavioral.mediator.services;

import java.util.ArrayList;
import java.util.List;

// Concrete Mediator
public class ChatRoom implements Mediator {
  public String sendMessage(String message, Colleague colleague) {
    // Broadcast the message to all other colleagues except the sender
    for (Colleague c : colleagues) {
      if (c != colleague) {
        c.receiveMessage(message);
      }
    }
    return "message send";
  }

  public void addColleague(Colleague colleague) {
    colleagues.add(colleague);
  }

  private List<Colleague> colleagues = new ArrayList<>();
}
