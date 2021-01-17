package com.rkjha.springdemo;

import org.springframework.stereotype.Component;

@Component
public class MyFortuneService implements Fortune {
    @Override
    public String getMyFortune() {
        return "MyFortuneService - My Fortune";
    }
}
