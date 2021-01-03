package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		//return "Today is a very lucky day!";
		String [] happyFortune = {"You can do it today!", 
				"You did one step forward!", "Today is a very lucky day!"};
		return getRandom(happyFortune);
	}
	
	public static String getRandom(String[] array) {
	    int rnd = new Random().nextInt(array.length);
	    return array[rnd];
	}

}
