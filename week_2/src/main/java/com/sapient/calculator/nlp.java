package com.sapient.calculator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class nlp {
	
	String ans;
	
	  public static int editDistance(String s1, String s2) {
		    s1 = s1.toLowerCase();
		    s2 = s2.toLowerCase();

		    int[] costs = new int[s2.length() + 1];
		    for (int i = 0; i <= s1.length(); i++) {
		      int lastValue = i;
		      for (int j = 0; j <= s2.length(); j++) {
		        if (i == 0)
		          costs[j] = j;
		        else {
		          if (j > 0) {
		            int newValue = costs[j - 1];
		            if (s1.charAt(i - 1) != s2.charAt(j - 1))
		              newValue = Math.min(Math.min(newValue, lastValue),
		                  costs[j]) + 1;
		            costs[j - 1] = lastValue;
		            lastValue = newValue;
		          }
		        }
		      }
		      if (i > 0)
		        costs[s2.length()] = lastValue;
		    }
		    return costs[s2.length()];
		  }
	
	public static double similarity(String s1, String s2) {
		  String longer = s1, shorter = s2;
		  if (s1.length() < s2.length()) { // longer should always have greater length
		    longer = s2; shorter = s1;
		  }
		  int longerLength = longer.length();
		  if (longerLength == 0) { return 1.0; /* both strings are zero length */ }
		  return (longerLength - editDistance(longer, shorter)) / (double) longerLength;
		}

	public nlp(String d) {
		String[] tokens = d.split(" ");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
		LocalDate date = LocalDate.now();
		String string1 = d;
		String[] bank = {"Today", "Tomorrow", "Day-aftertomorrow", "yesterday", "Day-before-yesterday", "Last week", "Previous week", "Next week", "Next month", "Next Year", "Last month", "Last year", "Month after", "Month before", "weeks from now","days from now","months from now", "years from now", "days earlier", "weeks earlier", "months earlier", "years earlier" };
		String temp ;
		for(String string2 : bank)
		{
			double sim = similarity(string1, string2);
			
			if(sim>=0.8)
			{
								
				if(string2 == "Today")
				{
					System.out.println(date);
					this.ans = date.format(df);
				}
				else if(string2 == "Tomorrow")
				{
					System.out.println(date.plusDays(1).format(df));
					this.ans = date.plusDays(1).format(df);
				}
				else if(string2 == "Day-aftertomorrow")
				{
					System.out.println(date.minusDays(1));
					this.ans = date.minusDays(1).format(df);
				}
				else if(string2 == "Day-before-yesterday")
				{
					System.out.println(date.minusDays(2));
					this.ans = date.minusDays(2).format(df);
				}
				else if(string2 == "Last week")
				{
					System.out.println(date.minusWeeks(1));
					this.ans = date.minusWeeks(1).format(df);
				}
				else if(string2 == "Previous week")
				{
					System.out.println(date.minusWeeks(1));
					this.ans = date.minusWeeks(1).format(df);
				}
				else if(string2 == "Next week")
				{
					System.out.println(date.plusWeeks(1));
					this.ans = date.plusWeeks(1).format(df);
				}
				else if(string2 == "Next month")
				{
					System.out.println(date.plusMonths(1));
					this.ans = date.plusMonths(1).format(df);
				}
				else if(string2 == "Next Year")
				{
					System.out.println(date.plusYears(1));
					this.ans = date.plusYears(1).format(df);
				}
				else if(string2 == "Last month")
				{
					System.out.println(date.minusMonths(1) );
					this.ans = date.minusMonths(1).format(df);
				}
				else if(string2 == "Last Year")
				{
					System.out.println(date.minusYears(1));
					this.ans = date.minusYears(1).format(df);
				}
				else if(string2 == "Month after")
				{
					int n = Integer.parseInt(tokens[0]);
					System.out.println(date.plusMonths(n));
					this.ans = date.plusMonths(n).format(df);
				}
				else if(string2 == "Month before")
				{
					int n = Integer.parseInt(tokens[0]);
					System.out.println(date.minusMonths(n));
					this.ans = date.minusMonths(n).format(df);
				}
				else if(string2 == "weeks from now")
				{
					int n = Integer.parseInt(tokens[0]);
					System.out.println(date.plusWeeks(n));
					this.ans = date.plusWeeks(n).format(df);
				}
				else if(string2 == "days from now")
				{
					int n = Integer.parseInt(tokens[0]);
					System.out.println(date.plusDays(n));
					this.ans = date.plusDays(n).format(df);
				}
				else if(string2 == "months from now")
				{
					int n = Integer.parseInt(tokens[0]);
					System.out.println(date.plusMonths(n));
					this.ans = date.plusMonths(n).format(df);
				}
				else if(string2 == "years from now")
				{
					int n = Integer.parseInt(tokens[0]);
					System.out.println(date.plusYears(n));
					this.ans = date.plusYears(n).format(df);
				}
				else if(string2 == "days earlier")
				{
					int n = Integer.parseInt(tokens[0]);
					System.out.println(date.minusDays(n));
					this.ans = date.minusDays(n).format(df);
				}
				else if(string2 == "weeks earlier")
				{
					int n = Integer.parseInt(tokens[0]);
					System.out.println(date.minusWeeks(n));
					this.ans = date.minusWeeks(n).format(df);
				}
				else if(string2 == "months earlier")
				{
					int n = Integer.parseInt(tokens[0]);
					System.out.println(date.minusMonths(n));
					this.ans = date.minusMonths(n).format(df);
				}
				else if(string2 == "years earlier")
				{
					int n = Integer.parseInt(tokens[0]);
					System.out.println(date.minusYears(n));
					this.ans = date.minusYears(n).format(df);
				}
 
				break;
			}
		}
		
	}

}
