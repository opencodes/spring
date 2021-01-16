package com.rkjha.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create Context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//Retrive Bean from container
		Coach coach = context.getBean("cricketCoach", Coach.class);
//call method
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getMyFortune());
	}

}
