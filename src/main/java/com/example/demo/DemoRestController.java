package com.example.demo;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController implements DemoRestClient{

  @Override
  public ResponseEntity<DemoObject> returnString() {
    DemoObject build = DemoObject.builder().string("String").build();
    build.add(linkTo(methodOn(DemoRestController.class).returnString()).withSelfRel());
    return ResponseEntity.ok(build);
  }
}
