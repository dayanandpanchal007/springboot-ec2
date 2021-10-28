package com.springboot.ec2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestApiController {

    @GetMapping
    public String testApiController() {
        return "<h1>Spring boot App is running!!!</h1>";
    }
}
