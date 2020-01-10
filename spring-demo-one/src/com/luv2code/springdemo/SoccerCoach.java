package com.luv2code.springdemo;

public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SoccerCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "Practice shooting for 1 hour.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
