package com.example.feign.client.fallback;

import com.example.feign.client.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystric implements FeignService {

    @Override
    public String sayHiFromFeignOne() {
        return "sorry, you are fail";
    }
}
