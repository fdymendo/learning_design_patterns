package com.fdymendo.learning.designpatterns.behavioral.memento.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fdymendo.learning.designpatterns.behavioral.memento.model.TextEditor;
import com.fdymendo.learning.designpatterns.behavioral.memento.model.TextEditorCareTaker;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/Memento/v1")
public class MementoController {

  @GetMapping("/RestoreItem")
  public String restoreItem() {
    TextEditor editor = new TextEditor();
    TextEditorCareTaker careTaker = new TextEditorCareTaker();

    // Add some text to the editor
    editor.addText("This is the first sentence. ");
    editor.addText("This is the second sentence. ");
    log.info("Current text: " + editor.getText());

    // Save the editor's state
    careTaker.addMemento(editor.save());

    // Add some more text to the editor
    editor.addText("This is the third sentence. ");
    log.info("Current text: " + editor.getText());

    // Restore the editor's previous state
    editor.restore(careTaker.getMemento(0));
    return "Current text: " + editor.getText();
  }
}
