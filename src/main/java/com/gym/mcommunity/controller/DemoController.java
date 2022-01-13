package com.gym.mcommunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class DemoController {

    @RequestMapping("/h")
    @ResponseBody
    public String hello() {
        return "hello Sping !";
    }
}
