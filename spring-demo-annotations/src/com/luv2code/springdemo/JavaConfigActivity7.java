package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigActivity7 {
	
	//define bean for our rest fortune service
	@Bean
	public FortuneService restFortuneService() {
		return new RestFortuneService();
	}
	
	//define bean for our Quiddich coach AND inject dependency
	@Bean
	public Coach quidditchCoach() {
		return new QuidditchCoach(restFortuneService());
	}
	


}
