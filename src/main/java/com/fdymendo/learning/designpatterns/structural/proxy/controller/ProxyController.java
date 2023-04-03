package com.fdymendo.learning.designpatterns.structural.proxy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.structural.proxy.services.ExpensiveResource;
import com.fdymendo.learning.designpatterns.structural.proxy.services.ExpensiveResourceProxy;

@RestController
@RequestMapping("/Proxy/v1")
public class ProxyController {

  @GetMapping("/ComplexProcess")
  public String getComplex() {
    ExpensiveResource resource = new ExpensiveResourceProxy();

    resource.performOperation();

    return resource.performOperation();
  }


}
