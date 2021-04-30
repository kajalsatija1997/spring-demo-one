package com.springLessons.springdemo;

public class BaseballCoach implements Coach{

	//Define private field for the dependency (Fortune service dependency injection )
	private FortuneService fortuneService; //interface to be injected
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in batting.";
	}

	@Override
	public String getDailyFortunes() {
		//Use MyFortuneService to get fortune 
		//Helping our coach by making use of this helper class
		return fortuneService.getFortune();
	}
	
			

}
