package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class DemoRestController implements DemoRestClient {

    public DemoServiceImpl service;

    @Autowired
    public DemoRestController (final DemoServiceImpl demoService) {
        this.service = demoService;
    }

    @Override
    public ResponseEntity<DemoObject> returnString() {
        DemoObject demoObject = service.getDemoObject();
        demoObject.add(linkTo(methodOn(DemoRestController.class).returnString()).withSelfRel());
        return ResponseEntity.ok(demoObject);
    }
}
