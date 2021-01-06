package com.luv2code.springdemo;

public class QuidditchCoach implements Coach{

	//define a private field for the dependency 
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public QuidditchCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "try to beat the Three River Dragons of Passau";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// add an Init method 
	public void doMyStartupStuff() {
		System.out.println("QuidditchCoach: inside method doMyStartupStuff");
	}
	
	//add a destroy method
	public void doMyCleanUpStuff() {
		System.out.println("QuidditchCoach: inside method doMyCleanupStuff");
	}
	
}
