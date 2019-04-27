package com.example.microservicesell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "com.example.microservicesell")
@EnableEurekaClient
@EnableWebMvc
@ImportResource(locations = {"classpath:application-bean.xml"})
public class MicroServiceSellApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceSellApplication.class, args);
    }
}