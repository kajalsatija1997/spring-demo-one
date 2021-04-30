package com.springLessons.springAssessmentDI;

public class GolfCoach implements Coach{

	public GolfCoach()
	{
		System.out.println("In default constructor of GolfCoach");
	}
	
	//Setter Injection
	private RandomFortuneService randFortuneService;
	
	public void setRandFortuneService(RandomFortuneService randFortuneService) {
		this.randFortuneService = randFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Exercising 4 hours daily!";
	}

	@Override
	public String getDailyFortunes() {
		return "Your predicted fortune is: "+randFortuneService.getFortune();
	}

}
