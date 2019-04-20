package com.example.microservicebuy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroServiceBuyController {
    @RequestMapping("/buy")
    @ResponseBody
    public String buy() {
        return "this is micro service buy.";
    }
}
