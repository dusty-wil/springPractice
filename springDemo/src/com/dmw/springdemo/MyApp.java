package com.dmw.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this is good design practice (coding to an interface) but is still hard-coded
		Coach bbc = new TrackCoach();
		System.out.println(bbc.getDailyWorkout());
	}

}
