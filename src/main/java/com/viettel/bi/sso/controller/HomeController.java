package com.viettel.bi.sso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = { "/", "/home/", "/index" })
    public String home() {
        return "This is Home Page";
    }
}
