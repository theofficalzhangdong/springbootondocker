package com.example.microservicesbuy.controller;

import com.example.microservicesbuy.bean.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/buy")
public class MicroServiceBuyController {

    //直接注入，不用new
    @Autowired
    Player kobe;

    @RequestMapping("/ball")
    @ResponseBody
    public String buy() {
        return "a boy which name is " + kobe.getName() +" buy the ball.";
    }
}
