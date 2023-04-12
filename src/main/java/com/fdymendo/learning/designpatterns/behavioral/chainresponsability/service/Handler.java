package com.fdymendo.learning.designpatterns.behavioral.chainresponsability.service;

public abstract class Handler {
  private Handler next;

  public void setNext(Handler handler) {
    next = handler;
  }

  public String handle(Request request) {
    if (next != null) {
      return next.handle(request);
    }
    return "nothing";
  }
}
