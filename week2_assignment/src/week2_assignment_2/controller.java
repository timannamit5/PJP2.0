package week2_assignment_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class controller {
	
	entryPojo temp;
		
	public controller(String path) throws Exception {
		BufferedReader file = new BufferedReader(new FileReader(path));
		String row;
		FileWriter file_1 = new FileWriter("output.csv");
		while ((row = file.readLine()) != null) {
		    String[] data = row.split(",");
		    temp.setTransactionId(data[0]);
		    temp.setClientId(data[1]);
		    temp.setSecurityId(data[2]);
		    temp.setTransType(data[3]);
		    temp.setTransDate(data[4]);
		    temp.setValue(data[5]);
		    temp.setFlag(data[6]);
		    String res = String.valueOf(temp.calculate());
		    
		    file_1.append(temp.getClientId());
		    file_1.append(",");
		    file_1.append(temp.getTransType());
		    file_1.append(",");
		    file_1.append(temp.getTransactionId());
		    file_1.append(",");
		    file_1.append(temp.getFlag());
		    file_1.append(",");
		    file_1.append(res);
		    file_1.append("\n");
		}
		
		file.close();
		file_1.close();
	}

	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter the path of the file");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//String str = "/home/krishna/Downloads/qw.csv";
		controller c = new controller(str);
		sc.close();
	}
	
	
}
