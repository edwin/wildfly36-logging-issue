package com.yusara.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api")
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping(value = "/hello")
    public String hello(@RequestParam String name) {
        String result = "Hello, " + name;
        System.out.println(result);
        logger.info(result);
        return result;
    }
}
