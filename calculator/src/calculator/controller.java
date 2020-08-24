package calculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class controller {
	
	public static void main(String[] args) throws IOException  {
		System.out.println("Choose 1 to enter single input or choose 2 to input a file");
		Scanner sc = new Scanner(System.in);
		sessionContainer ses = new  sessionContainer();
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				int n = 0;
				
				while(n!=6)
				{
					System.out.println("Enter 1 to Subtract/add two dates, Enter 2 to Subtract/add time to a date, Enter 3 to tell the day of the week, Enter 4 to tell the week number and Enter 5 for NLP translations.");
					n = sc.nextInt();
					sc.nextLine();
					Session ins = new Session();
					switch(n) {
					case 1:
						String d1 = sc.nextLine();
						String d2 = sc.nextLine();
						String op = sc.nextLine();
						ins.setIn(d1+" "+op+" "+d2);
						TwoDate x = new TwoDate(d1,d2,op);
						ins.setOut(x.temp);
						break;
					case 2:
						String d3 = sc.nextLine();
						String op1 = sc.nextLine();
						String d4 = sc.nextLine();
						ins.setIn(d3+" "+op1+" "+d4);
						OneDate y = new OneDate(d3, d4, op1);
						ins.setOut(y.temp);
						break;
					case 3:
						String d5 = sc.nextLine();
						ins.setIn(d5);
						Day z = new Day(d5);
						ins.setOut(z.temp);
						break;
					case 4:
						String d6 = sc.nextLine();
						ins.setIn(d6);
						Week w = new Week(d6);
						ins.setOut(w.temp);
						break;
					case 5:
						String d7 = sc.nextLine();
						ins.setIn(d7);
						nlp n1 = new nlp(d7);
						ins.setOut(n1.ans);
						break;
					}
					ses.write(ins);
				}
				ses.showRecent();
				ses.close();
				sc.close();
				
				break;
			case 2:
				File file = new File("/home/krishna/eclipse-workspace/calculator/src/calculator/input.txt"); 
			    Scanner sc2 = new Scanner(file); 
			  
			    while (sc2.hasNextLine()) 
			    {
			    	Session ins = new Session();
			    	String str = sc2.nextLine(); 				    	
			    	int op2 = str.charAt(0)-'0';
			    	String s = str.substring(2);
			    	ins.setIn(s);
			    	
			    	switch(op2) {
					case 1:
						TwoDate x = new TwoDate(s);
						ins.setOut(x.temp);
						break;
					case 2:
						OneDate y = new OneDate(s);
						ins.setOut(y.temp);
						break;
					case 3:
						Day z = new Day(s);
						ins.setOut(z.temp);
						break;
					case 4:
						Week w = new Week(s);
						ins.setOut(w.temp);
						break;
					case 5:
						nlp n1 = new nlp(s);
						ins.setOut(n1.ans);
						break;
					}
			    	ses.write(ins);
			    }
			    
			    ses.showRecent();
			    sc2.close();
			    ses.close();
				break;
		}
		
    }
	
}