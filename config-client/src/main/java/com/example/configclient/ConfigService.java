package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class ConfigService {
    @Value("${a.b.c}")
    private String var;

    public String getConfig() {
        return var;
    }
}
