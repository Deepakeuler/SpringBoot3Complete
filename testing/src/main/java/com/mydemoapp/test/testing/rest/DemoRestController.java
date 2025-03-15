package com.mydemoapp.test.testing.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    //expose "/" endpoint that will return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
}
