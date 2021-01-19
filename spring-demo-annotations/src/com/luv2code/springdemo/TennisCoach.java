package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") for naming the Bean

//default Bean ID will be "tennisCoach"
@Component
public class TennisCoach implements Coach {

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
