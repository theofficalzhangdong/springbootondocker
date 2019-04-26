package com.example.microservicebuy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MicroServiceSellController {
    @RequestMapping("/sell/water")
    @ResponseBody
    public String sell() {
        return "this is micro service sell.";
    }
}