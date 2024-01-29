package com.simple.oauth2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class CustomerController {

    @GetMapping("/")
    public String getCustomerProfile() {

        return "hello, customer";
    }

    @GetMapping("/secured")
    public String getSecured() {

        return "hello, secured";
    }
}