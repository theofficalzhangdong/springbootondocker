package com.example.ribbonclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonClientOneController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/ribbonclient/port")
    public String getPort() {
        return "this is from port : " + port;
    }
}
