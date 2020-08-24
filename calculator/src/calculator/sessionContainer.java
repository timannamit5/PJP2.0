package calculator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class sessionContainer {
	
	private Queue<Session> q;
	private FileWriter file;
	
	public sessionContainer() throws IOException
	{
		this.q = new LinkedList<>();
		
		File file = new File("output.txt");

		if (!file.exists()) {
			this.file = new FileWriter("output.txt");
		}
		else
		{
			this.file = new FileWriter("output.txt", true);
		}

	} 
	
	public void write(Session s)
	{
		if(this.q.size()==100)
		{
			this.q.remove();
		}
		
		this.q.add(s);
		
		try {
			this.file.write(s.output());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showRecent()
	{
		for(Session x:q)
		{
			System.out.print("Recent 100 sessions");
			System.out.println(x.output());
		}
	}
	
	public void close()
	{
		try {
			this.file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

			
}
