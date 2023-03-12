package com.fdymendo.learning.designpatterns.creational.adapter.service;

// Client code that uses the IDataFormatter interface
public class Client {
  public String printData(IDataFormatter formatter, String[][] data) {
    String formattedData = formatter.formatData(data);
    return formattedData;
  }
}
