package com.springLessons.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach,DisposableBean {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService)
	{
		System.out.println("Hi I am parameterized constructor of TrackCoach");
		fortuneService=theFortuneService;
	}
	
	public TrackCoach() {
		System.out.println("Hi I am default constructor of TrackCoach");
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortunes() {
		return "Just Do it: "+ fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff()
	{
	System.out.println("TrackCoach: inside method doMyStartupStuff");	
	}
	
	//add a destroy method
	public void doMyCleanupStuff()
	{
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}

	//implement DisposableBean interface to destroy prototype beans
	@Override
	public void destroy() throws Exception {
		System.out.println("TrackCoach: inside method DisposableBean destroy() for prototype beans");
	}

}
