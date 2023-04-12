package com.fdymendo.learning.designpatterns.behavioral.templatemethod.model;

import com.fdymendo.learning.designpatterns.behavioral.templatemethod.service.OrderProcessTemplate;
import lombok.extern.log4j.Log4j2;

// Concrete class implementing the template method
@Log4j2
public class OnlineOrder extends OrderProcessTemplate {

  public void selectProduct() {
    log.info("Product selected from online store.");
  }

  public void doPayment() {
    log.info("Payment made through online payment gateway.");
  }

  public void deliverProduct() {
    log.info("Product delivered by courier.");
  }

}
