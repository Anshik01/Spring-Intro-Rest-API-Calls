package com.uc.hello.hellocontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // api will return hello message
    @RequestMapping(value = {"", "/"})
    public String sayHello(){
        return "Hello from BridgeLabz.";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHelloWithName(@RequestParam(value = "name") String name){
        return "Hello " + name + "!";
    }

}
