package com.fdymendo.learning.designpatterns.behavioral.mediator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.behavioral.mediator.services.ChatRoom;
import com.fdymendo.learning.designpatterns.behavioral.mediator.services.Colleague;
import com.fdymendo.learning.designpatterns.behavioral.mediator.services.Mediator;
import com.fdymendo.learning.designpatterns.behavioral.mediator.services.User;

@RestController
@RequestMapping("/Mediator/v1")
public class MediatorController {


  @GetMapping("/SendMessage")
  public String broadcastMessage() {
    Mediator chatRoom = new ChatRoom();
    Colleague john = new User("John", chatRoom);
    Colleague jane = new User("Jane", chatRoom);
    Colleague mark = new User("Mark", chatRoom);

    chatRoom.addColleague(john);
    chatRoom.addColleague(jane);
    chatRoom.addColleague(mark);
    return john.sendMessage("Hello everyone!");
  }

}
