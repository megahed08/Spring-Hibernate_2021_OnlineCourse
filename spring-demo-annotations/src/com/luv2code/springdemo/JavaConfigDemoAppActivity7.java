package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoAppActivity7 {

	public static void main(String[] args) {

		//read spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(JavaConfigActivity7.class);
		
		//get the bean from spring container
		Coach theCoach = context.getBean("quidditchCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call a method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
		
	}

}
