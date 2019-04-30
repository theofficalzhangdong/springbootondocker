package com.example.microservicesell.controller;


import com.example.microservicesell.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/sell")
public class MicroServiceSellController {

    @Resource(name="testService")
    private IService iService;

    @RequestMapping(value = "/water")
    @ResponseBody
    public String sell() {
        return "we sell the water for player which named " + iService.get();
    }
}