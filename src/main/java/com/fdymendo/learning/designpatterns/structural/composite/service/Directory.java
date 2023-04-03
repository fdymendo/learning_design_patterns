package com.fdymendo.learning.designpatterns.structural.composite.service;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Component {
  private String name;
  private List<Component> components;

  public Directory(String name) {
    this.name = name;
    components = new ArrayList<Component>();
  }

  public void addComponent(Component component) {
    components.add(component);
  }

  public void removeComponent(Component component) {
    components.remove(component);
  }

  public String showDetails() {
    StringBuilder stringBuilder = new StringBuilder();
    for (Component component : components) {
      stringBuilder.append(component.showDetails());
    }
    return name + " " + stringBuilder.toString() + " ";
  }
}
