package com.example.loggerlombok.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MyRestController {

    @GetMapping(value = "/test")
    public String test(){
        return "I am working!";
    }

    @GetMapping(value = "/lombok")
    public String testLogger(){
        log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");

        return "check the console log..";
    }
}
