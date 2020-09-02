package com.sapient.calculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class controller {
	
	public static void main(String[] args) throws IOException  {
		System.out.println("Choose 1 to enter single input or choose 2 to input a file");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				int n = 0;
				
				while(n!=6)
				{
					System.out.println("Enter 1 to Subtract/add two dates, Enter 2 to Subtract/add time to a date, Enter 3 to tell the day of the week, Enter 4 to tell the week number and Enter 5 for NLP translations.");
					n = sc.nextInt();
					sc.nextLine();
					switch(n) {
					case 1:
						String d1 = sc.nextLine();
						String d2 = sc.nextLine();
						String op = sc.nextLine();
						TwoDate x = new TwoDate(d1,d2,op);
						break;
					case 2:
						String d3 = sc.nextLine();
						String op1 = sc.nextLine();
						String d4 = sc.nextLine();
						OneDate y = new OneDate(d3, d4, op1);
						break;
					case 3:
						String d5 = sc.nextLine();
						Day z = new Day(d5);
						break;
					case 4:
						String d6 = sc.nextLine();
						Week w = new Week(d6);
						break;
					case 5:
						String d7 = sc.nextLine();
						nlp n1 = new nlp(d7);
						break;
					}
				}
				sc.close();
				
				break;
			case 2:
				File file = new File("/home/krishna/eclipse-workspace/calculator/src/calculator/input.txt"); 
			    Scanner sc2 = new Scanner(file); 
			  
			    while (sc2.hasNextLine()) 
			    {
			    	String str = sc2.nextLine(); 				    	
			    	int op2 = str.charAt(0)-'0';
			    	String s = str.substring(2);
			    	
			    	switch(op2) {
					case 1:
						TwoDate x = new TwoDate(s);
						break;
					case 2:
						OneDate y = new OneDate(s);
						break;
					case 3:
						Day z = new Day(s);
						break;
					case 4:
						Week w = new Week(s);
						break;
					case 5:
						nlp n1 = new nlp(s);
						break;
					}
	
			    }
			    
			    sc2.close();
				break;
		}
		
    }
	
}