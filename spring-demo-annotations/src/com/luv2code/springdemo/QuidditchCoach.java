package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class QuidditchCoach implements Coach {

	public String getDailyWorkout() {
		return "Catch the snitch";
	}

}
