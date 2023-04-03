package com.fdymendo.learning.designpatterns.behavioral.memento.model;

//Originator Class
public class TextEditor {
 private StringBuilder text;
 
 public TextEditor() {
     text = new StringBuilder();
 }
 
 public void addText(String newText) {
     text.append(newText);
 }
 
 public String getText() {
     return text.toString();
 }
 
 public TextEditorMemento save() {
     return new TextEditorMemento(text.toString());
 }
 
 public void restore(TextEditorMemento memento) {
     text = new StringBuilder(memento.getState());
 }
}