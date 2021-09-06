package com.shville.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目启动类
 * http://localhost:8080
 * 更新代码需重启
 */

@RestController
// 程序的主入口
@SpringBootApplication
public class HelloworldApplication {

    @RequestMapping("/")
    String home() {
        return "Home Page";
    }

    // SpringApplication: http://localhost:8080/...
    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }

}
