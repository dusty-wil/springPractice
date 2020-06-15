package com.dmw.diIntro;

public class FortuneTellerImpl implements FortuneTeller {

	private FortuneService fortuneService;
	
	public FortuneTellerImpl(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
