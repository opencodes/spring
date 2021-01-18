package com.rkjha.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

    private Fortune fortune;
    @Value("${name}")
    public String name;

    SwimCoach(Fortune fortune1){
        fortune = fortune1;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim workout - " + this.name;
    }

    @Override
    public String getMyFortune() {
        return "Swim Fortune";
    }
}
