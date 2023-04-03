package com.fdymendo.learning.designpatterns.behavioral.memento.model;

import java.util.ArrayList;
import java.util.List;

// Caretaker Class
public class TextEditorCareTaker {
  private List<TextEditorMemento> mementos = new ArrayList<TextEditorMemento>();

  public void addMemento(TextEditorMemento memento) {
    mementos.add(memento);
  }

  public TextEditorMemento getMemento(int index) {
    return mementos.get(index);
  }
}
