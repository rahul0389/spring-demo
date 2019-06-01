package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Retrive bean from spring container
		
		Coach thecoach = context.getBean("myCoach",Coach.class);
		
		// Call methods on bean 
		System.out.println(thecoach.getDailyWorkout());
		// close the context
		context.close();
	}

}
