package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

  @GetMapping(value = "/example", consumes = "application/json")
  public ResponseEntity<DemoObject> returnString() {
    DemoObject build = DemoObject.builder().string("String").build();
    return ResponseEntity.ok(build);
  }
}
