package com.musayuxel.demo.my_first_app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


class HelloObject {
    private String name;

    public HelloObject() {
    }

    public HelloObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
@RestController
public class FunRestController {
    //    expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello Auto Deployed World!!!!";
    }

    //    PARAMS: http://localhost:8080/hello?name=Musa
    @GetMapping("/names")
    public String sayHelloToName(@RequestParam String name) {
        return "Hello " + name;
    }


// BODY: http://localhost:8080/hello
//      {
//          "name": "Musa"
//      }

    @GetMapping("/hello")
    public String sayHelloToBodyObject(@RequestBody HelloObject helloObject) {
        return "Hello " + helloObject.getName();
    }
}