package com.maidou.springboot.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2017-2018, maimai corp
 * FileName: HelloWorld.java
 * Author:   hyz
 * Date:     2018-10-07 19:16
 * Description:
 */
@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @RequestMapping("/")
    public String hello() {

        return "hello world";
    }

}