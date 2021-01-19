package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") for naming the Bean

//default Bean ID will be "tennisCoach"
@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">>TennisCoach: inside default constuctor");	
	}
	
	//define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">>TennisCoach: inside setFortuneService() method");	
		fortuneService = theFortuneService;
	}
	/*
	//if @Autowired is commented it will still inject the constructor as of new Spring feature
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
