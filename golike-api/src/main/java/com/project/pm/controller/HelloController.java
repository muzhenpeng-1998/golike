package com.project.pm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nameM
 */
@RequestMapping({"hello"})
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object hello(){
        return "Hello Word !";
    }
}
