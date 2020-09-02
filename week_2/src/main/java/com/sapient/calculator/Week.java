package com.sapient.calculator;

public class Week {

	String temp;
	
	public Week(String d6)  {
		DatePojo d = new DatePojo(d6);
		temp = d.monCal();

	}

}
