package com.fdymendo.learning.designpatterns.behavioral.chainresponsability.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.behavioral.chainresponsability.model.HighValueHandler;
import com.fdymendo.learning.designpatterns.behavioral.chainresponsability.model.LowValueHandler;
import com.fdymendo.learning.designpatterns.behavioral.chainresponsability.service.Handler;
import com.fdymendo.learning.designpatterns.behavioral.chainresponsability.service.Request;

@RestController
@RequestMapping("/ChainResponsability/v1")
public class ChainResponsabilityController {

  @GetMapping("/ValueLow")
  public String getValueLow() {
    Handler lowValueHandler = new LowValueHandler();
    Handler highValueHandler = new HighValueHandler();

    lowValueHandler.setNext(highValueHandler);

    Request request1 = new Request("Request with a low value", 50);

    return lowValueHandler.handle(request1);
  }

  @GetMapping("/ValueHigh")
  public String getValueHigh() {
    Handler lowValueHandler = new LowValueHandler();
    Handler highValueHandler = new HighValueHandler();

    lowValueHandler.setNext(highValueHandler);

    Request request2 = new Request("Request with a high value", 150);

    return lowValueHandler.handle(request2);
  }
}
