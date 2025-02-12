package com.example.demo.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public String hello() {
        return "hello - STD21089";
    }
}
