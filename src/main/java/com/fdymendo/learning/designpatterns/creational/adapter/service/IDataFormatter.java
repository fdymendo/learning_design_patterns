package com.fdymendo.learning.designpatterns.creational.adapter.service;

// Target interface that the client uses
public interface IDataFormatter {
  String formatData(String[][] data);
}
