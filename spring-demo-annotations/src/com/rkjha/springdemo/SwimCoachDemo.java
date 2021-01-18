package com.rkjha.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimCoachDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        Coach coach = context.getBean("swimCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getMyFortune());
        context.close();
    }

}
