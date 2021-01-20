package com.luv2code.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class QuidditchCoach implements Coach {


	private FortuneService fortuneService;
	
	
	//define a default constructor
	public QuidditchCoach() {
		System.out.println(">>QuidditchCoach: inside default constuctor");	
	}
	
	
	//@Qualifier("...") for constructor injection is written inside with parameters 
	@Autowired
	public QuidditchCoach(@Qualifier("databaseFortuneService") FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	

	@Override
	public String getDailyWorkout() {
		return "Catch the snitch";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
