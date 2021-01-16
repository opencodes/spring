package com.rkjha.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class CricketCoach implements Coach, DisposableBean {
	public MyFortuneService fortuneSvc;
	public String emailAddress;
	public String name;

	CricketCoach() {

	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("My emailAddress "+ emailAddress);

		this.emailAddress = emailAddress;
	}

	public void setName(String name) {
		System.out.println("My name "+ name);
		this.name = name;
	}

	public void setFortuneSvc(MyFortuneService fortuneSvc) {
		System.out.println("Setter Method Called");
		this.fortuneSvc = fortuneSvc;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Cricket Coach - Practice ";
	}

	@Override
	public String getMyFortune() {
		// TODO Auto-generated method stub
		return fortuneSvc.getMyFortune();
	}
	
	public void init() {
		System.out.println("Init Bean");
	}
	
	// add a destroy method
	@Override
	public void destroy() throws Exception {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");		
	}

}
