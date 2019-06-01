package com.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach: Inside setter method- Set Email Address");
		this.emailAddress = emailAddress;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("Cricket Coach: Inside setter method- Set Team");
		this.team = team;
	}
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
