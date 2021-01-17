package com.rkjha.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FortuneService implements Fortune {
    @Override
    public String getMyFortune() {
        return "You are lucky";
    }
}
