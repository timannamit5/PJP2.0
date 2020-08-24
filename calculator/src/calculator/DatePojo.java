package calculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*; 

public class DatePojo {
	
	private Date date;
	
	public Date getDate() {
		return date;
	}

	public DatePojo(String x)    {
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
		try {
			this.date = (Date) f.parse(x);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
	public String dayCal()
	{
		SimpleDateFormat f = new SimpleDateFormat("EEE");
		System.out.println(f.format(this.date)); 
		return f.format(this.date);
	}
	
	public String monCal()
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(this.date);
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		return String.valueOf(cal.get(Calendar.WEEK_OF_YEAR));

	}

	public String ad(Date date2) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM1-yyyy");
		
		Calendar c1 = Calendar.getInstance();
		c1.setTime(this.date);
		Calendar c2 = Calendar.getInstance();
		c2.setTime(date2);
		Calendar cTotal = (Calendar) c1.clone();
		cTotal.add(Calendar.YEAR, c2.get(Calendar.YEAR));
	    cTotal.add(Calendar.MONTH, c2.get(Calendar.MONTH) + 1); 
	    cTotal.add(Calendar.DATE, c2.get(Calendar.DATE));
	    
	    Date n = (Date) cTotal.getTime();
	    System.out.println(dateFormat.format(n));
	    
	    return dateFormat.format(n);
		
	}

	public String sub(Date date2) {
		long diff = this.date.getTime() - date2.getTime();
         
        long days = (diff / (1000 * 60 * 60 * 24)) % 365;
         
        long years =  (diff / (1000l * 60 * 60 * 24 * 365));
        
        System.out.println(years+" years, "+days+" days");
        return years+" years, "+days+" days";
    }		
	
}
