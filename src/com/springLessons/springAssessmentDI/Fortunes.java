package com.springLessons.springAssessmentDI;

import java.util.Random;

import com.springLessons.springdemo.FortuneService;

public class Fortunes implements RandomFortuneService {

	@Override
	public String getFortune() {
		String[] fortunes= {"Today you will run into difficulties :-(","Today is your lucky day!",
				"Today you will hear some good news :-)","Today is your bad day! Sorry!"};
		int randomFortune=new Random().nextInt(fortunes.length);
		String fortune=fortunes[randomFortune];
		return fortune;
	}

}
