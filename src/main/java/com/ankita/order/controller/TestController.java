package com.ankita.order.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/ping")
    @ResponseStatus(value = HttpStatus.OK)
    public String ping() {
        return "PONG";
    }
}
