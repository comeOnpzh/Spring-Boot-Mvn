package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Enzo Cotter on 2020/10/12.
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String Hello(){
        return "hello world";
    }
    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
