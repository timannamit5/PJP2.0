package com.sapient.calculator;

public class Day {

	String temp;
	public Day(String d5) {
		DatePojo d = new DatePojo(d5);
		temp = d.dayCal();
		
	}

}
