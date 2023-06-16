package com.example.springtestjava8.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/index")
    public String startSpringBoot(){
        return "hello springboot github";
    }

    @RequestMapping("/hello")
    public  String sayHello(){
        return  "This is hello methodsayhello";
    }

    @RequestMapping("/bye")
    public  String sayBye(){
        return  "This is bye method";
    }


}
