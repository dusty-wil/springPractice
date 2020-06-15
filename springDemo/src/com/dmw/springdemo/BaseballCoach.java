package com.dmw.springdemo;

public class BaseballCoach implements Coach
{
	@Override
	public String getDailyWorkout() {
		return "spend 30m on batting practice";
	}
}