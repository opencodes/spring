package com.rkjha.springdemo;

public class BaseballCoach implements Coach {
	
	public MyFortuneService fortuneSvc;

	BaseballCoach(MyFortuneService fs) {
		this.fortuneSvc = fs;
	}	
	
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getMyFortune() {
		// TODO Auto-generated method stub
		return fortuneSvc.getMyFortune();
	}
	
	public void init() {
		System.out.println("Init Bean");
	}
	
	public void destroy() {
		System.out.println("Destroy Bean");
	}
}
