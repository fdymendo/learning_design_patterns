package com.fdymendo.learning.designpatterns.behavioral.memento.model;

import lombok.Data;

// Memento Class
@Data
public class TextEditorMemento {
 
  private String state;

  public TextEditorMemento(String state) {
    this.state = state;
  }
  
}
