package com.rkjha.springdemo;

public class SadFortuneService implements Fortune {

	@Override
	public String getMyFortune() {
		return "Today is a sad day";
	}

}
