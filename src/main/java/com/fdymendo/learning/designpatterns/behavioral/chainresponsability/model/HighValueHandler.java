package com.fdymendo.learning.designpatterns.behavioral.chainresponsability.model;

import com.fdymendo.learning.designpatterns.behavioral.chainresponsability.service.Handler;
import com.fdymendo.learning.designpatterns.behavioral.chainresponsability.service.Request;

public class HighValueHandler extends Handler {
  @Override
  public String handle(Request request) {
    if (request.getValue() >= 100) {
      return "HighValueHandler handled the request: " + request.getDescription();
    } else {
      return super.handle(request);
    }
  }
}
