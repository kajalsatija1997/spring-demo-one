package com.springLessons.springdemo;

public class CricketCoach implements Coach {

	//Create a no-arg constructor coz Spring gonna call this constructor
	public CricketCoach()
	{
		System.out.println("Hi I am default constructor of Cricket coach...");
	}
	
	//Dependency to be injected should be private 
	private FortuneService fortuneService;
	
	//Literal to be injected should be private as well for Literal injection
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside setTeam");
		this.team = team;
	}
	
	
	//Setter Injection 
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Completed 4 hours work today..";
	}

	@Override
	public String getDailyFortunes() {
		return "Cheer up Cricket Team: "+ fortuneService.getFortune();
	}


}
