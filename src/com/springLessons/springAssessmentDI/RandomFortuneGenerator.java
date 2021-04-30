package com.springLessons.springAssessmentDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneGenerator {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		GolfCoach myGolf=context.getBean("myGolfCoach",GolfCoach.class);
		
		System.out.println(myGolf.getDailyWorkout());
		
		System.out.println(myGolf.getDailyFortunes());
		
		context.close();
		
				
				
	}

}
