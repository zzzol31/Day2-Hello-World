package com.helloworld.Hello.World.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ResponseBody
@Controller
@RequestMapping("/hello3")
public class HelloWorldController3 {

    @RequestMapping("")
    public String hello(){
        return "Hello, World3!";
    }

    @RequestMapping("/spring")
    public String hello2(){
        return "Hello, Spring!";
    }
}
