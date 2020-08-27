package week2_assignment_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Flushable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class controller {
	
	public controller(String str) throws Exception
	{
		
		BufferedReader file = new BufferedReader(new FileReader(str));
		//BufferedReader file_2 = new BufferedReader(new FileReader(str));
		String row;
		FileWriter file_1 = new FileWriter("output.csv");
		List<entryPojo> ll = new ArrayList<entryPojo>();
		//Map<String, Double> hm = new HashMap<String, Double>();
		int count = 0;
		
//		while ((row = file.readLine()) != null) {
//			
//			if(count==0)
//			{
//				;
//			}
//			else
//			{
//				String[] data = row.split(",");
//				
//				if("".contentEquals(data[1]))
//				{
//					if(hm.containsKey(data[0]))
//					{
//						hm.put(data[0], Double.parseDouble(data[4]) + hm.get(data[0]));
//					}
//					else
//					{
//						hm.put(data[0], Double.parseDouble(data[4]));
//					}
//				}
//				else
//				{
//					if(hm.containsKey(data[1]))
//					{
//						hm.put(data[1], Double.parseDouble(data[4]) + hm.get(data[1]));
//					}
//					else
//					{
//						hm.put(data[1], Double.parseDouble(data[4]));
//					}
//				}
//			}
//			
//		}
//		
//		count = 0;
		
		//Map<String, Integer> m = new HashMap<String, Integer>();
		while((row = file.readLine()) != null)
		{
			String[] data = row.split(",");

				entryPojo t = new entryPojo();
			    t.setCity(data[0]);
			    t.setCountry(data[1]);
			    t.setGender(data[2]);
			    t.setCurrency(data[3]);
			    t.setAmount(data[4]);
			    ll.add(t);
		}
		
		for(int i=1;i<ll.size();i++)
		{
			for(int j=1;j<ll.size()-i-1;j++)
			{
				swap s = new swap();
				if("".contentEquals(ll.get(j).getCountry()))
				{
					if("".contentEquals(ll.get(j+1).getCountry()))
					{
						if(ll.get(j).getCity().compareTo(ll.get(j+1).getCity())>0)
							s.swap(ll.get(j),ll.get(j+1));
					}
					else
					{
						if(ll.get(j).getCity().compareTo(ll.get(j+1).getCountry())>0)
							s.swap(ll.get(j),ll.get(j+1));
					}
				}
				else
				{
					if("".contentEquals(ll.get(j+1).getCountry()))
					{
						if(ll.get(j).getCountry().compareTo(ll.get(j+1).getCity())>0)
							s.swap(ll.get(j),ll.get(j+1));
					}
					else
					{
						if(ll.get(j).getCountry().compareTo(ll.get(j+1).getCountry())>0)
							s.swap(ll.get(j),ll.get(j+1));
					}
				}

			}
		}
		
		for(entryPojo temp:ll)
		{
			if("".contentEquals(temp.getCountry()))
		    	{
				file_1.append(temp.getCity());
		    	}
		    else
		    	file_1.append(temp.getCountry());
		    
		    file_1.append(",");
		    file_1.append(temp.getGender());
		    file_1.append(",");
		    file_1.append(temp.calculate());
		    file_1.append("\n");
		}
		
		file.close();
		file_1.flush();
		file_1.close();


	}
	
	public static void main(String[] args) throws Exception
	{
//		System.out.println("Enter the path of the file");
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
		String str = "/home/krishna/Downloads/a.csv";
		controller c = new controller(str);
//		sc.close();
	}
}
