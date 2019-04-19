package com.example.mydocker.Controller;

import com.example.mydocker.Service.IService;
import com.example.mydocker.pojo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * the controller of this program ， will add cloud
 *
 */
@RestController
public class MyDockerController {


//    @Autowired
//    private IService iService;

    @Resource(name="testService")
    private IService iService;

    @RequestMapping("/hello")
    public String hello() {
        return iService.get();
    }

    @RequestMapping("/")
    public String index() {
        return "this is index";
    }

    @GetMapping("/getAddr")
    @Cacheable(value = "address-cache")
    public String getAddress() {
        Address addr = new Address("001", "HZ");
        return addr.getCity();
    }

    @RequestMapping("/hellodocker")
    @ResponseBody
    public String sayHelloToDocker() {
        return "this spring boot program is running on docker.";
    }
}
