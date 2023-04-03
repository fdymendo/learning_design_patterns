package com.fdymendo.learning.designpatterns.behavioral.memento.model;

//Memento Class
public class TextEditorMemento {
 private String state;
 
 public TextEditorMemento(String state) {
     this.state = state;
 }
 
 public String getState() {
     return state;
 }
}