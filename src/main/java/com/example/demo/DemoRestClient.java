package com.example.demo;

import org.springframework.hateoas.MediaTypes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface DemoRestClient {
  @GetMapping(path = "/example", produces = MediaTypes.HAL_JSON_VALUE)
  @ResponseStatus(HttpStatus.OK)
  ResponseEntity<DemoObject> returnString();
}
