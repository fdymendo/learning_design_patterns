package com.fdymendo.learning.designpatterns.behavioral.facade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.behavioral.facade.model.SubSystemFacade;

@RestController
@RequestMapping("/Facade/v1")
public class FacadeController {

  private SubSystemFacade subsystemFacade;

  public FacadeController() {
    this.subsystemFacade = new SubSystemFacade();
  }

  @GetMapping("/Iniciar")
  public String getInicialize() {
    return this.subsystemFacade.initialize();
  }

  @GetMapping("/Apagar")
  public String getShutdown() {
    return this.subsystemFacade.shutdown();
  }
}

