package com.fdymendo.learning.designpatterns.behavioral.mediator.services;

public interface Mediator {
  public String sendMessage(String message, Colleague colleague);

  public void addColleague(Colleague colleague);

}
