package com.fdymendo.learning.designpatterns.creational.chainresponsability.model;

public class LowValueHandler extends Handler {
  public String handle(Request request) {
    if (request.getValue() < 100) {
      return "LowValueHandler handled the request: " + request.getDescription();
    } else {
      return super.handle(request);
    }
  }
}
