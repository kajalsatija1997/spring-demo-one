package com.springLessons.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load the Spring Configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve the bean from Spring configuration file
		Coach myCoach=context.getBean("myCoach",Coach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		
		//close the context
		context.close();

	}

}
