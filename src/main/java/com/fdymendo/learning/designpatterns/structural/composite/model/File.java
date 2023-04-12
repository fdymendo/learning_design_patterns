package com.fdymendo.learning.designpatterns.structural.composite.model;

import com.fdymendo.learning.designpatterns.structural.composite.service.Component;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class File implements Component {
  
  private String name;
  private int size;

  public String showDetails() {
    return "File name: " + name + ", Size: " + size + " KB";
  }
  
}
