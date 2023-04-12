package com.fdymendo.learning.designpatterns.behavioral.memento.model;

import lombok.Data;

// Originator Class
@Data
public class TextEditor {

  private StringBuilder text;

  public TextEditor() {
    text = new StringBuilder();
  }

  public void addText(String newText) {
    text.append(newText);
  }

  public TextEditorMemento save() {
    return new TextEditorMemento(text.toString());
  }

  public void restore(TextEditorMemento memento) {
    text = new StringBuilder(memento.getState());
  }

}
