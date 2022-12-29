package com.zyn.demo.controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/demo")
public class Demo {


    @RequestMapping("/demo")
    public String getHello(){
        return "hello 赵怡宁";
    }
}
