package com.fdymendo.learning.designpatterns.behavioral.mediator.model;

import java.util.ArrayList;
import java.util.List;
import com.fdymendo.learning.designpatterns.behavioral.mediator.services.Colleague;
import com.fdymendo.learning.designpatterns.behavioral.mediator.services.Mediator;

// Concrete Mediator
public class ChatRoom implements Mediator {

  private List<Colleague> colleagues = new ArrayList<>();

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

}
