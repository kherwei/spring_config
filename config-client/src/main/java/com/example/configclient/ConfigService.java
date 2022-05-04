package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RefreshScope
public class ConfigService {
    @Value("${a.b.c}")
    private String var;

    private String _var;

    @PostConstruct
    public void refresh() {
        _var = var;
    }

    public String getConfig() {
        return _var;
    }
}
