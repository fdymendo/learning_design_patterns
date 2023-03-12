package com.fdymendo.learning.designpatterns.creational.adapter.service;

import java.util.Arrays;

// Adapter - a class that adapts the CsvFormatter interface to the IDataFormatter interface
public class CsvAdapter implements IDataFormatter {
  private CsvFormatter csvFormatter;

  public CsvAdapter(CsvFormatter csvFormatter) {
    this.csvFormatter = csvFormatter;
  }

  public String formatData(String[][] data) {
    String[][] csvData = csvFormatter.formatCsv(data);
    // Convert CSV to IDataFormatter format
    // Implementation code here...
    // Flatten the 2D array into a 1D array
    String[] flatData = Arrays.stream(csvData).flatMap(Arrays::stream).toArray(String[]::new);

    // Print the 1D array
    return Arrays.toString(flatData);
  }
}
