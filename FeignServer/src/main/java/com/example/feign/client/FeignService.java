package com.example.feign.client;

import com.example.feign.client.fallback.FeignServiceHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//加入熔断器的功能，当Ribbon-Client没有开启的时候，也就是服务器挂掉的时候，会返回错误，不会造成服务器崩溃
@FeignClient(value = "service-ribbon-client", fallback = FeignServiceHystric.class)
public interface FeignService {
    @RequestMapping(value = "/ribbonclient/port",method = RequestMethod.GET)
    String sayHiFromFeignOne();
}
