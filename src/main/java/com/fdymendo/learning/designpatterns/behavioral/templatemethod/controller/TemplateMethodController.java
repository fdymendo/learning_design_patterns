package com.fdymendo.learning.designpatterns.behavioral.templatemethod.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.behavioral.templatemethod.model.OnlineOrder;
import com.fdymendo.learning.designpatterns.behavioral.templatemethod.model.OrderProcessTemplate;

@RestController
@RequestMapping("/TemplateMethod/v1")
public class TemplateMethodController {

  @PostMapping("/ProcessOrder")
  public String processOrder() {
    OrderProcessTemplate order = new OnlineOrder();
    return order.processOrder();
  }
}
