package com.Sachinx.FirstSpring;

import org.springframework.web.bind.annotation.*;

@RestController    // specialized version of controller Annotation
public class HelloController {

    @GetMapping("/hello/{name}")  // dynamic  path
    public HelloResponse helloParam(@PathVariable String name){
        return new HelloResponse("Hello, "+name);
    }

    @GetMapping("/hello")  //this /hello invoke below method
    public HelloResponse hello(){
        return new HelloResponse("Hello,  world");
    }

    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody String name){
        return new HelloResponse( "hello"+name+ "!");
    }
}
