package com.assignment3.assignment3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/your_server")
public class Assignment3Application {
    public static void main(String[] args) {
        SpringApplication.run(Assignment3Application.class, args);
    }
    @RequestMapping("")
    public String index(@RequestParam(value="first_name", required=false) String first_name, @RequestParam(value = "last_name", required = false) String last_name) {
        if (first_name == null){
            return "<h1>Hello Human!</h1><p>Welcome to SpringBoot!</p>";
        }
        return "<h1>Hello "+first_name+" "+last_name+"!</h1><p>Welcome to SpringBoot!</p>";
    }
}
