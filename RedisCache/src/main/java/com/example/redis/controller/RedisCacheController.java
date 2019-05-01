package com.example.redis.controller;

import com.example.redis.pojo.NbaPlayer;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//多次刷新页面，不会到这个方法里读取信息，而是直接读取缓存信息
@RestController
public class RedisCacheController {
    @GetMapping("/getPlayer")
    @Cacheable(value = "player-cache")
    public String getNbaPlayerInfo() {
        NbaPlayer kobe = new NbaPlayer("kobe", 17);
        System.out.println("only first print");
        return kobe.getName();
    }
}
