package com.fdymendo.learning.designpatterns.behavioral.strategy.model;

import com.fdymendo.learning.designpatterns.behavioral.strategy.service.PaymentStrategy;
import lombok.Data;

// Concrete strategy classes
@Data
public class CreditCardPayment implements PaymentStrategy {
  
  private String cardNumber;
  private String cardHolderName;
  private String expiryDate;
  private int cvv;

  public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate, int cvv) {
    this.cardNumber = cardNumber;
    this.cardHolderName = cardHolderName;
    this.expiryDate = expiryDate;
    this.cvv = cvv;
  }

  public String pay(double amount) {
    return "$" + amount + " paid with credit card " + cardNumber;
  }
}
