package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	public TrackCoach() {
		
	}
	
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 2 miles.";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it: " + fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartupStuff(){
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}

	// add a destroy method
	public void doMyCleanupStuffYoYo(){
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}

}
