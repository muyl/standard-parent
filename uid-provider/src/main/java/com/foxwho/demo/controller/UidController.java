package com.foxwho.demo.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UidController {



    @GetMapping("/")
    public String index() {
        return "index";
    }
}
