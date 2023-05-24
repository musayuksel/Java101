package com.musayuxel.demo.my_first_app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
//    expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

//    PARAMS: http://localhost:8080/hello?name=Musa
    @GetMapping("/names")
    public String sayHelloToName(@RequestParam String name){
        return "Hello " + name;
    }
}