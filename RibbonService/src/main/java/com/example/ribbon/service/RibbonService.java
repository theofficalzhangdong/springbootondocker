package com.example.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    public String hiRibbonService(String name) {
        //SERVICE-RIBBON-CLIENT指的是注册中心中显示的application·
        return restTemplate.getForObject("http://SERVICE-RIBBON-CLIENT/ribbonclient/port", String.class);
    }
}