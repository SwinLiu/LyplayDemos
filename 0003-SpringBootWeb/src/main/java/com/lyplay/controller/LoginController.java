package com.lyplay.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class LoginController {


	@RequestMapping("/")
    String home() {
        return "Hello M1y World1!";
    }
	
	@RequestMapping("/test")
    String test() {
        return "test Hello M1y World1!";
    }
	
}
