package com.fdymendo.learning.designpatterns.behavioral.observer.model;

import java.util.ArrayList;
import java.util.List;
import com.fdymendo.learning.designpatterns.behavioral.observer.service.Observable;
import com.fdymendo.learning.designpatterns.behavioral.observer.service.Observer;
import lombok.Data;

// Concrete Observable class
@Data
public class WeatherStation implements Observable {

  private List<Observer> observers;
  private int temperature;

  public WeatherStation() {
    observers = new ArrayList<>();
  }

  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
    notifyObservers();
  }
}
