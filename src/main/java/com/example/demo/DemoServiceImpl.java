package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl {

    public DemoObject getDemoObject() {
        return DemoObject.builder()
                .string("String")
                .build();
    }
}
