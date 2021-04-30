package com.springLessons.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach myCricket=context.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println(myCricket.getDailyWorkout());
		
		System.out.println(myCricket.getDailyFortunes());
		
		System.out.println(myCricket.getEmailAddress());
		
		System.out.println(myCricket.getTeam());
		
		context.close();
		
				
				
	}

}
