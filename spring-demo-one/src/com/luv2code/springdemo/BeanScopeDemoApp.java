package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		//Activity 3
		Coach quidditchCoach1 = context.getBean("myQuidditchCoach", Coach.class);
		Coach quidditchCoach2 = context.getBean("myQuidditchCoach", Coach.class);

		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		//print out the results
		System.out.println("\nPointing to the same object: " + result);

		System.out.println("\nMemory location for theCoach: " + theCoach);

		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		//Activity 3
		result = (quidditchCoach1==quidditchCoach2);
		System.out.println("\nActivity 3: \nPointing to the same object: " + result);
		System.out.println("\nMemory location for quidditchCoach1: " + quidditchCoach1);
		System.out.println("\nMemory location for quidditchCoach2: " + quidditchCoach2);
		
		//close the context
		context.close();
	}

}
