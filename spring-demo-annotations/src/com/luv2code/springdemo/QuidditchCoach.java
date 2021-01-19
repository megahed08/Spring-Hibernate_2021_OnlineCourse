package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QuidditchCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public QuidditchCoach(FortuneService theFortuneService) {
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
