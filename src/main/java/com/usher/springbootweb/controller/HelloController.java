package com.usher.springbootweb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {
    @Value("${person.last-name}")
    private String name;
    @ResponseBody
    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello "+ name;
    }
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user){

        return "Hello World";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object>map) {
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }
}
