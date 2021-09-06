package com.shville.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 添加文本子页面
 * http://localhost:8080/hello
 */

@RestController
public class HelloWorld {

    // 接口: http://localhost:8080/hello
    @RequestMapping("/hello")
    public String hello() {
        return "hello world !";
    }
}
