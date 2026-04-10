package com.example.first_jenkins_sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("test2");
        return "Hello, Jenkins CI/CD!";
    }
}
