package com.example.microservicebuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "com.example.microservicebuy")
@EnableEurekaClient
@EnableWebMvc
public class MicroServiceSellApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceSellApplication.class, args);
    }
}