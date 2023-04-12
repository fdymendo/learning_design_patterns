package com.fdymendo.learning.designpatterns.structural.bridge.model;

import com.fdymendo.learning.designpatterns.structural.bridge.service.Color;

public class Green implements Color {
  public String fill() {
    return "Filling with green color";
  }
}
