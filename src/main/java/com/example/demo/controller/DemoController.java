package com.example.demo.controller;

import com.example.demo.dao.DemoObject;
import com.example.demo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("/hello")
    public String test(){
        return "hello world!";
    }

    @GetMapping("/getDemoObject")
    public DemoObject getDemoObject(){
        return demoService.getDemo();
    }

    @GetMapping("/testLog")
    public void testLombok(){
        log.info("info");
        log.debug("debug");
        log.error("error");
        log.warn("warn");
    }
}
