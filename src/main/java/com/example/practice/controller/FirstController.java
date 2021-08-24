package com.example.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FirstController {

    @GetMapping("/kim")
    public String hello() {
        return "hello";
    }

    @GetMapping("/test")
    public String test() {
        return "테스트입니다.";
    }

}
