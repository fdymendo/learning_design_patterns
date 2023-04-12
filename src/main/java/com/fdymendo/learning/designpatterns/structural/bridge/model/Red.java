package com.fdymendo.learning.designpatterns.structural.bridge.model;

import com.fdymendo.learning.designpatterns.structural.bridge.service.Color;

public class Red implements Color {
  public String fill() {
    return "Filling with red color";
  }
}
