package com.demospringsecurity2.demospringsecurity2.domain;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
Create By: Ron Rith
Create Date: 2/15/2018
*/
@RestController
public class HelloController {
    private UserDetailsService userService;

    @GetMapping("/")
    public String greeting(Authentication authentication) {
        return "Spring Security In-memory Authentication Example";
    }
}
