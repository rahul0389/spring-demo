package com.springdemo;

public class BaseballCoach implements Coach{
	private FortuneService myFortuneService;
	
	public BaseballCoach(FortuneService myuFortuneService) {
		myFortuneService= myuFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting.";
	}

	@Override
	public String getFortune() {
		
		return myFortuneService.getFortune();
	}

}
