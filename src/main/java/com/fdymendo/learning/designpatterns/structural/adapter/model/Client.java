package com.fdymendo.learning.designpatterns.structural.adapter.model;

import com.fdymendo.learning.designpatterns.structural.adapter.service.IDataFormatter;

// Client code that uses the IDataFormatter interface
public class Client {
  public String printData(IDataFormatter formatter, String[][] data) {
    return formatter.formatData(data);
  }
}
