package org.imdroid.coursesapi.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/Hello") 
    public String getHello(){
        return "Hello";
    }
    
}
