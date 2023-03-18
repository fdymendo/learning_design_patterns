package com.fdymendo.learning.designpatterns.creational.composite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.creational.composite.service.Component;
import com.fdymendo.learning.designpatterns.creational.composite.service.Directory;
import com.fdymendo.learning.designpatterns.creational.composite.service.File;

@RestController
@RequestMapping("/Composite/v1")
public class CompositeController {

  @GetMapping("/Directory")
  public String getFolders() {

    Component file1 = new File("file1.txt", 10);
    Component file2 = new File("file2.txt", 20);

    Directory dir1 = new Directory("dir1");
    dir1.addComponent(file1);
    dir1.addComponent(file2);

    return dir1.showDetails();
  }

}