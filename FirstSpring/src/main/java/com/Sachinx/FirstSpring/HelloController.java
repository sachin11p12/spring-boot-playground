package com.Sachinx.FirstSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController    // specialized version of controller Annotation

public class HelloController {

    @GetMapping("/hello")  //this /hello invoke below method
    public String hello(){
        return  "Hello Sachin !";
    }
}
