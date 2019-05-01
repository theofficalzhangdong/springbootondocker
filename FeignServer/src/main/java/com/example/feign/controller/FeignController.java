package com.example.feign.controller;

import com.example.feign.client.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Email miles02@163.com
 *
 * @author fangzhipeng
 * create 2018-07-09
 **/
@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @RequestMapping("/ribbonclient/port")
    public String sayHi() {
        return feignService.sayHiFromFeignOne();
    }
}