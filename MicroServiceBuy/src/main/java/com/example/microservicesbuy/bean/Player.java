package com.example.microservicesbuy.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//匹配属性前缀
@ConfigurationProperties(prefix = "player")
public class Player {

    private String name;

    private int age;

    public String getName() {
        System.out.print("the name is : " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
