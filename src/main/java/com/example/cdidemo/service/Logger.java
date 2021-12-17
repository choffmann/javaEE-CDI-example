package com.example.cdidemo.service;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.UUID;

@SessionScoped
public class Logger implements Serializable {
    private UUID uuid = UUID.randomUUID();

    public void log(String msg) {
        System.out.println("[" + uuid + "] " + msg);
    }
}
