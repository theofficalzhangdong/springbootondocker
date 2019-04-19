package com.example.mydocker.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * the controller of this program ， will add cloud
 *
 */
@RestController
public class MyDockerController {

    @RequestMapping("/hellodocker")
    @ResponseBody
    public String sayHelloToDocker() {
        return "this spring boot program is running on docker.";
    }
}
