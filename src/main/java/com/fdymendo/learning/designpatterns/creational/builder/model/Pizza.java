package com.fdymendo.learning.designpatterns.creational.builder.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pizza {
  private String size;
  private String crustType;
  private String sauceType;
  private String cheeseType;
  private List<String> toppings;

}
