package com.demospringsecurity2.demospringsecurity2.domain.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
Create By: Ron Rith
Create Date: 2/15/2018
*/
@Controller
public class HelloController {
    private UserDetailsService userService;

    @RequestMapping(value = "/")
    public String greeting(Authentication authentication) {
        return "hello";
    }
}
