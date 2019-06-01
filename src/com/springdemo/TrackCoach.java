package com.springdemo;

public class TrackCoach implements Coach {
private FortuneService fortuneService;
public TrackCoach(FortuneService myFortuneService)
{
	fortuneService = myFortuneService;
}
	public String getDailyWorkout() {
		
		return "Run 5k daily.";
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortune();
	}
	
	//add an init and destroy method
	
	public void doMyBootstarp()
	{
		System.out.println("TrackCoach: Inside startup method");
	}
	
	public void doMyCleanup() {
		System.out.println("TrackCoach: Inside Cleanup  method");
	}

}
