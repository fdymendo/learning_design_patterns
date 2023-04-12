package com.fdymendo.learning.designpatterns.behavioral.templatemethod.model;

// Concrete class implementing the template method
public class OnlineOrder extends OrderProcessTemplate {
  public void selectProduct() {
    System.out.println("Product selected from online store.");
  }

  public void doPayment() {
    System.out.println("Payment made through online payment gateway.");
  }

  public void deliverProduct() {
    System.out.println("Product delivered by courier.");
  }
}
