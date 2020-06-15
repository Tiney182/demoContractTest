package com.example.demo;

import org.junit.Before;
import org.mockito.BDDMockito;
import org.springframework.http.ResponseEntity;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

public class BaseContractTest {

  @Before
  public void setup() {
    DemoObject build = DemoObject.builder().string("String").build();

    DemoRestController demoRestController = BDDMockito.mock(DemoRestController.class);
    BDDMockito.given(demoRestController.returnString()).willReturn(ResponseEntity.ok(build));
    RestAssuredMockMvc.standaloneSetup(demoRestController);
  }
}
