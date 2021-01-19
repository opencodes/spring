package com.rkjha.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = context.getBean(Student.class);

        System.out.println("Join Pints - study");
        student.study(12);
        System.out.println("-----------------");
        System.out.println("Join Pints - studyAtNight");
        student.studyAtNight(10,11);

    }
}
