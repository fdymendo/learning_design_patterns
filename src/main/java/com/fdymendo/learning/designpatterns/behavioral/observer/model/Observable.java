package com.fdymendo.learning.designpatterns.behavioral.observer.model;

// Observable interface
public interface Observable {
  void addObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers();
}
