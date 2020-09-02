package com.sapient.calculator;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class OneDate {
	
	String op;
	String temp;
	
	public OneDate(String d3, String d4, String op)  {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		DatePojo dp1 = new DatePojo(d3);
		this.op = op;
		String[] tokens = d4.split(" ");
		int num = Integer.parseInt(tokens[0]);
		
		Calendar c = Calendar.getInstance();
        c.setTime(dp1.getDate());
        
        if(op=="-")
        	num*=(-1);
		
		if(tokens[1]=="month" || tokens[1]=="months")
		{
			c.add(Calendar.MONTH,num);
		}
		else if(tokens[1]=="year" || tokens[1]=="years")
		{
			c.add(Calendar.YEAR,num);
		}
		else if	(tokens[1]=="day" || tokens[1]=="days")
		{
			c.add(Calendar.DATE,num);
		}
		
		Date n = (Date) c.getTime();
		this.temp = dateFormat.format(n);
		System.out.println(dateFormat.format(n));

	}

	public OneDate(String str)  {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");

		String[] tokens = str.split(" ");
		DatePojo dp1 = new DatePojo(tokens[0]);
		this.op = tokens[1];
		int num = Integer.parseInt(tokens[2]);
		
		Calendar c = Calendar.getInstance();
        c.setTime(dp1.getDate());
        
        if(op=="-")
        	num*=(-1);
		
		if(tokens[3]=="month" || tokens[3]=="months")
		{
			c.add(Calendar.MONTH,num);
		}
		else if(tokens[3]=="year" || tokens[3]=="years")
		{
			c.add(Calendar.YEAR,num);
		}
		else if	(tokens[3]=="day" || tokens[3]=="days")
		{
			c.add(Calendar.DATE,num);
		}
		
		Date n = (Date) c.getTime();
		this.temp = dateFormat.format(n);
		System.out.println(dateFormat.format(n));

	}

}
