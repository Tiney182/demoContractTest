package com.example.demo;

import org.springframework.hateoas.RepresentationModel;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DemoObject extends RepresentationModel {

  String string;
}
