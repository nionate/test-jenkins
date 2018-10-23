package com.tw.ss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/spring")
    public String hello() {
        return "helloSpring";
    }

}
