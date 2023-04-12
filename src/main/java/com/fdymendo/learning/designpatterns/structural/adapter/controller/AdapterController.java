package com.fdymendo.learning.designpatterns.structural.adapter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.structural.adapter.model.Client;
import com.fdymendo.learning.designpatterns.structural.adapter.service.CsvAdapter;
import com.fdymendo.learning.designpatterns.structural.adapter.service.CsvFormatter;

@RestController
@RequestMapping("/Adapter/v1")
public class AdapterController {


  @GetMapping("/Csv")
  public ResponseEntity<String> getCsv() {
    CsvFormatter csvFormatter = new CsvFormatter();
    CsvAdapter adapter = new CsvAdapter(csvFormatter);
    Client client = new Client();
    String[][] data = {{"John", "Doe"}, {"Jane", "Smith"}};
    return ResponseEntity.ok(client.printData(adapter, data));
  }

}
