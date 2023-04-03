package com.fdymendo.learning.designpatterns.behavioral.chainresponsability.model;

public class HighValueHandler extends Handler {
  public String handle(Request request) {
    if (request.getValue() >= 100) {
      return "HighValueHandler handled the request: " + request.getDescription();
    } else {
     return super.handle(request);
    }
  }
}
