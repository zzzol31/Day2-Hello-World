package com.helloworld.Hello.World.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ResponseBody
@Controller
public class HelloWorldController2 {


    @RequestMapping("/hello2")
    public String hello(){
        return "Hello, World2!";
    }
}
