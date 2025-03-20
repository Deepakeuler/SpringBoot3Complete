package com.mydemoapp.test.testing.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    //expose "/" endpoint that will return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/test")
    public String test(){
        return "Testing my dev tools";
    }

    @GetMapping("/test/testing")
    public String testTesting(){
        return "Testing my dev tools part 2";
    }

    @GetMapping("/layer2")
    public String layer2(){
        return "Layer 2";
    }
}
