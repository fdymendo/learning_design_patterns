package com.fdymendo.learning.designpatterns.behavioral.templatemethod.service;

import lombok.extern.log4j.Log4j2;

// Abstract class with template method
@Log4j2
public abstract class OrderProcessTemplate {

  public final String processOrder() {
    selectProduct();
    doPayment();
    if (isGiftWrap()) {
      giftWrap();
    }
    deliverProduct();
    return "successfully processed";
  }

  public abstract void selectProduct();

  public abstract void doPayment();

  public final void giftWrap() {
    log.info("Gift wrap done.");
  }

  public abstract void deliverProduct();

  public boolean isGiftWrap() {
    return false;
  }
}
