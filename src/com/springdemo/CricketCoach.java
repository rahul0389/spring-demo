package com.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: Inside setter method- Set Fortune Service");
		this.fortuneService = fortuneService;
	}
	public CricketCoach() {
		System.out.println("Cricket Coach: Inside no arg constructor");
	}
	@Override
	public String getDailyWorkout() {
	
		return "Practice fast bowling for 30 minutes.";
	}

	@Override
	public String getFortune() {

		return fortuneService.getFortune();
	}

}
