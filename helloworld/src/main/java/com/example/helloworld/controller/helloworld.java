package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Enzo Cotter on 2020/9/28.
 */
@RestController
public class helloworld {
    @RequestMapping("/hello")
    public String Helloworld(){
        return "hello,world";
    }
}
