package com.fdymendo.learning.designpatterns.creational.facade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.creational.facade.model.SubsystemFacade;

@RestController
@RequestMapping("/Facade/v1")
public class FacadeController {

  private SubsystemFacade subsystemFacade;

  public FacadeController() {
    this.subsystemFacade = new SubsystemFacade();
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

