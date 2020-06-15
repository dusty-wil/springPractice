package com.dmw.diIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DIIntroSpringApp 
{
	public static void main(String[] args)
	{
		// load spring config
		
		// this is more configurable, and uses IoC to generate the Coach class
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("this is a test");
		
		FortuneTeller ft = ctx.getBean("myFortuneTeller", FortuneTeller.class);

		FortuneTeller ft2 = ctx.getBean("anotherFortuneTeller", FortuneTeller.class);
		System.out.println(ft.getDailyFortune());
		System.out.println(ft2.getDailyFortune());
		System.out.println(FortuneTeller.class);
		
		// close context
		ctx.close();
	}
}
