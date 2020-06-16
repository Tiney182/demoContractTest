package com.example.demo;

import org.junit.Before;
import org.mockito.BDDMockito;
import org.springframework.http.ResponseEntity;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

public class BaseContractTest {

  @Before
  public void setup() {
    DemoObject build = DemoObject.builder().string("String").build();

    DemoServiceImpl demoService = BDDMockito.mock(DemoServiceImpl.class);
    BDDMockito.given(demoService.getDemoObject()).willReturn(build);
    RestAssuredMockMvc.standaloneSetup(new DemoRestController(demoService));
  }
}
