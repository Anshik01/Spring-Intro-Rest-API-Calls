package com.uc.hello.hellocontroller;

import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {

    // Creating user class
    static class User{
        String firstName;
        String lastName;

        User(){
            firstName = "Anshik";
            lastName = "Jaiswal";
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName(){
            return lastName;
        }
    }


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

    // Post mapping
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }
}
