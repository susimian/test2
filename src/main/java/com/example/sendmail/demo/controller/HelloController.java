package com.example.sendmail.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// 控制器
// hello
@RestController
public class HelloController {
    @GetMapping("/admin/hello")
    public String admin(){
        return "hello admin";
    }
    @GetMapping("/user/hello")
    public String user(){
        return "hello user";
    }
    @GetMapping("/db/hello")
    public String dba(){
        return "hello dba";
    }
    @GetMapping("/student/hello")
    public String student(){
        return "hello student";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
