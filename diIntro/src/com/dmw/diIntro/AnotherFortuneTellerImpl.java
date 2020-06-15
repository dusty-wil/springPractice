package com.dmw.diIntro;

public class AnotherFortuneTellerImpl implements FortuneTeller {

	private FortuneService fortuneService;
	
	public AnotherFortuneTellerImpl() 
	{
		System.out.println("Constructor called");
	}
		
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return "The spirits are pleased today: " + fortuneService.getFortune();
	}

}
