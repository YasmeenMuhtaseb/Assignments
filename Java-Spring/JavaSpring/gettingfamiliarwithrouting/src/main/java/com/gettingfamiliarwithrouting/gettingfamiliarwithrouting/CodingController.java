package com.gettingfamiliarwithrouting.gettingfamiliarwithrouting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {
    @RequestMapping("/coding")
    public String display_one(){
        return "Hello Coding Dojo!";
    }
    @RequestMapping("/coding/python")
    public String display_two(){
        return "Python/Django was awesome!";
    }
    @RequestMapping("/coding/java")
    public String display_three(){
        return "Java/Spring is better!";
    }

}
