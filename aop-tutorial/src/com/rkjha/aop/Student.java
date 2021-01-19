package com.rkjha.aop;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public int study(int time){
        System.out.println("I am doing study! - " + time);
        return time;
    }

    public void studyAtNight(int time, int time2){
        System.out.println("I am doing study at night!");
    }
}
