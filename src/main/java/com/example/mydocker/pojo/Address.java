package com.example.mydocker.pojo;

import java.io.Serializable;

public class Address implements Serializable {

    private String id;
    private String city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(String id, String city) {
        super();
        this.id = id;
        this.city = city;
    }

}
