package com.example.microservicesbuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "com.example.microservicesbuy")
@EnableEurekaClient
@EnableWebMvc
public class MicroServiceBuyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceBuyApplication.class, args);
    }
}