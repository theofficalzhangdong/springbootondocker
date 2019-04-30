package com.example.ribbon.controller;

import com.example.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/ribbon")
public class RibbonController {
//    @Autowired
//    RibbonService ribbonService;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/test")
    public String helloRibbon() {
        String url="http://SERVICE-RIBBON-CLIENT/ribbonclient/port";
        return restTemplate.getForObject(url,String.class);
    }
}
