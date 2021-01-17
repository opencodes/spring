package com.rkjha.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements Fortune {

    @Override
    public String getMyFortune() {
        return "HappyFortuneService - Today is your lucky day!";
    }


}
