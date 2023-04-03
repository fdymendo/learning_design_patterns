package com.fdymendo.learning.designpatterns.behavioral.iterator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.behavioral.iterator.service.Iterator;
import com.fdymendo.learning.designpatterns.behavioral.iterator.service.NameRepository;

@RestController
@RequestMapping("/Iterator/v1")
public class IteratorController {

  @GetMapping("/Elements")
  public String getElements() {
    String[] names = {"John", "Jane", "Mark", "Rachel"};
    NameRepository repository = new NameRepository(names);
    Iterator iterator = repository.createIterator();

    StringBuilder responseElements = new StringBuilder();
    while (iterator.hasNext()) {
      String name = (String) iterator.next();
      responseElements.append("Name: " + name + " ");
    }

    return responseElements.toString();
  }

}
