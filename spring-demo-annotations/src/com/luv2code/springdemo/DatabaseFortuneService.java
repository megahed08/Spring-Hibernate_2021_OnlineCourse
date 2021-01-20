package com.luv2code.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
	

	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> DatabaseFortuneService: inside of doMyStartupStuff()");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> DatabaseFortuneService: inside of doMyCleanupStuff()");
	}
	
	//read data from properties file
	@Value("${foo.data}")
	private String [] data;
	
	//create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		//pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
