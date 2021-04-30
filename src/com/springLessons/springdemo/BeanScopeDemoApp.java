package com.springLessons.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the Spring Configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve the bean from Spring configuration file
		Coach myCoach=context.getBean("myCoach",Coach.class);
		
		Coach myAlphaCoach=context.getBean("myCoach",Coach.class);
		
		//Check if they are the same
		boolean result=myCoach==myAlphaCoach;
		
		//Checking the result
		System.out.println("Pointing to the same object: "+result);
		
		System.out.println("Memory location for the myCoach"+myCoach);
		
		System.out.println("Memory location for myAlphaCoach"+myAlphaCoach);
		
		//close the context
		context.close();

	}

}
