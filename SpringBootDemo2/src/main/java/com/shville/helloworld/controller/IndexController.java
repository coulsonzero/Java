package com.shville.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;


/**
 * 添加html子页面
 *
 * 1.通过@Controller跳转Templates目录下的所有页面
 * 2.pom.xml文件中导入Thymeleaf引擎： <artifactId>spring-boot-starter-thymeleaf</artifactId>
 * 3.通过 http://localhost:8080/test 访问resources/templates中的test.html文件
 * 4.html文件中：
 *   a.<div th:text="${msg}"></div>
 *   b.<html lang="en" xmlns:th="http://www.thymeleaf.org">
 */

@Controller
public class IndexController {
    /*
    @RequestMapping("/test")
    public String index() { return "test"; }
    */


    @RequestMapping("/test")
    public String index(Model model) {
        //向网页传递参数信息
        model.addAttribute("msg", "hello, springboot");

        model.addAttribute("users", Arrays.asList("peking", "shville"));
        return "test";
    }
}
