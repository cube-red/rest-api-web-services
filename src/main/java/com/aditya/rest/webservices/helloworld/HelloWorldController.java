package com.aditya.rest.webservices.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloWorldController {

    @GetMapping(path = "/hello-bean")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }


}

