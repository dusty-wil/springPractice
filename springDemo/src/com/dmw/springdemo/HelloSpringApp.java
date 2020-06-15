package com.dmw.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args)
	{
		// load spring config
		
		// this is more configurable, and uses IoC to generate the Coach class
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean
		Coach coach = ctx.getBean("myCoach", Coach.class);
		
		// call bean methods
		System.out.println(coach.getDailyWorkout());
		
		// close context
		ctx.close();
	}
	
}
