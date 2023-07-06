package com.zidong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Aa {
    @Autowired
    private Bb bb;

    @Value("${jdbc.username}")
    private String name;

    @Override
    public String toString() {
        return "Aa{" +
                "bb=" + bb +
                ", name='" + name + '\'' +
                '}';
    }
}
