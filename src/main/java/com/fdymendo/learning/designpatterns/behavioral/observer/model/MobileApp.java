package com.fdymendo.learning.designpatterns.behavioral.observer.model;

import com.fdymendo.learning.designpatterns.behavioral.observer.service.Observer;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Log4j2
// Concrete Observer class
public class MobileApp implements Observer {
 
  @Getter
  private int temperature = 0;
  private WeatherStation weatherStation;

  public MobileApp(WeatherStation weatherStation) {
    this.weatherStation = weatherStation;
    weatherStation.addObserver(this);
  }

  public void update() {
    this.temperature = weatherStation.getTemperature();
    log.info("Mobile app: The temperature is " + temperature + " degrees.");
  }
  
}
