package com.fdymendo.learning.designpatterns.behavioral.strategy.model;

import com.fdymendo.learning.designpatterns.behavioral.strategy.service.PaymentStrategy;
import lombok.Data;

@Data
public class PayPalPayment implements PaymentStrategy {

  private String email;
  private String password;

  public PayPalPayment(String email, String password) {
    this.email = email;
    this.password = password;
  }

  public String pay(double amount) {
    return "$" + amount + " paid with PayPal";
  }

}
