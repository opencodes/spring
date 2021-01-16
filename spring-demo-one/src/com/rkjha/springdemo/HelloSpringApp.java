package com.rkjha.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach ch = cx.getBean("myCoach", Coach.class);
		
		System.out.println(ch.getDailyWorkout());
		System.out.println(ch.getDailyWorkout());
		
		cx.close();
	}

}
