package com.example.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-ribbon-client")
public interface FeignService {
    @RequestMapping(value = "/ribbonclient/port",method = RequestMethod.GET)
    String sayHiFromFeignOne();
}
