package com.fdymendo.learning.designpatterns.behavioral.observer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.behavioral.observer.model.MobileApp;
import com.fdymendo.learning.designpatterns.behavioral.observer.model.WeatherStation;

@RestController
@RequestMapping("/Observer/v1")
public class ObserverController {

  @GetMapping("/StateApp")
  public String getTemperature() {
    WeatherStation weatherStation = new WeatherStation();
    MobileApp mobileApp = new MobileApp(weatherStation);

    // Set the temperature of the weather station
    weatherStation.setTemperature(25);
    return "Mobile app: The temperature is " + mobileApp.getTemperature() + " degrees.";
  }
}
