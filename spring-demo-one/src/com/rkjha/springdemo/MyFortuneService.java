package com.rkjha.springdemo;

public class MyFortuneService implements FortuneService {
	
	String[] fortunes = {"Lucky", "Un Lucky", "No Luck","---"};

	@Override
	public String getMyFortune() {
		double n = Math.random() * 10 /3;
		// TODO Auto-generated method stub
		return fortunes[(int) n];
	}

}
