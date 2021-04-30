package com.springLessons.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes= {"Today you will run into difficulties :-(","Today is your lucky day!",
				"Today you will hear some good news :-)","Today is your bad day! Sorry!"};
		int randomFortune=new Random().nextInt(fortunes.length);
		String fortune=fortunes[randomFortune];
		return fortune;
	}

}
	