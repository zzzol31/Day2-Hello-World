package com.helloworld.Hello.World.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @RequestMapping("/hello")
    public String hello(){
        return "Hello, World!";
    }
}
