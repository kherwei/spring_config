package com.example.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private ConfigService configService;

    @GetMapping("/test")
    public String test() {
        return configService.getConfig();
    }
}
