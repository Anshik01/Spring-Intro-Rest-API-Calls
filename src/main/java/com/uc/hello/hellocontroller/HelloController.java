package com.uc.hello.hellocontroller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    // api will return hello message
    @RequestMapping(value = {"", "/"})
    public String sayHello(){
        return "Hello from BridgeLabz.";
    }

    // api will return hello with the query name provided by user
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHelloWithName(@RequestParam(value = "name") String name){
        return "Hello " + name + "!";
    }

    // api will return hello with the name used in link
    @GetMapping("/prams/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello " + name + "!";
    }
}
