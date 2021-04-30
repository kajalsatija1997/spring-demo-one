package com.springLessons.springdemo;

public class MyApp {

	public static void main(String[] args) {
	
		/*
		 * Can add any type of coach but hardcoded have to change the source code, Lets
		 * use soring to make this app configurable
		 */
		/* coach theCoach = new BaseballCoach(); */
		
		Coach theCoach = new TrackCoach(); 
		System.out.println(theCoach.getDailyWorkout());

	}

}