package com.atguigu.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Reference
    HelloService helloService;
    @RequestMapping("/hello")
    public String getName(String name){
        return helloService.saHello(name);
    }
}
