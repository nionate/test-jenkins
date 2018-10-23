package com.tw.ss.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @GetMapping("/login")
    public String hello() {
        logger.info("LoginController.execute called");
        return "helloSpring";
    }

}
