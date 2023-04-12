package com.fdymendo.learning.designpatterns.behavioral.strategy.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.behavioral.strategy.model.CreditCardPayment;
import com.fdymendo.learning.designpatterns.behavioral.strategy.model.Item;
import com.fdymendo.learning.designpatterns.behavioral.strategy.model.PayPalPayment;
import com.fdymendo.learning.designpatterns.behavioral.strategy.model.ShoppingCart;

@RestController
@RequestMapping("/Strategy/v1")
public class StrategyController {

  @PostMapping("/Payment/CreditCard")
  public String getCreditCard() {
    ShoppingCart cart = new ShoppingCart();
    cart.addItem(new Item("Shirt", 20.0));
    cart.addItem(new Item("Pants", 30.0));
    cart.setPaymentStrategy(new CreditCardPayment("1234567890123456", "John Doe", "10/25", 123));
    return cart.pay(); // Outputs "$50.0 paid with credit card 1234567890123456"
  }

  @PostMapping("/Payment/PayPal")
  public String getPayPal() {
    ShoppingCart cart = new ShoppingCart();
    cart.addItem(new Item("Shirt", 20.0));
    cart.addItem(new Item("Pants", 30.0));
    cart.setPaymentStrategy(new PayPalPayment("johndoe@example.com", "password123"));
    return cart.pay(); // Outputs "$50.0 paid with PayPal"
  }


}
