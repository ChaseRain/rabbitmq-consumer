package cn.com.pcauto.myboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by linlixin on 2020/11/23.
 */

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello springBoot!";
    }

}
