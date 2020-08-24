package calculator;

public class TwoDate {

	char op;
	String temp;
	
	public TwoDate(String d1, String d2, String o)  {
		DatePojo dp1 = new DatePojo(d1);
		DatePojo dp2 = new DatePojo(d2);
		this.op = o.charAt(0);
		if(op=='+')
		{
			this.temp = dp1.ad(dp2.getDate());
		}
		else if(op=='-')
		{
			this.temp = dp1.sub(dp2.getDate());
		}
	}

	public TwoDate(String str)  {
		String d1 = str.substring(0,10);
		str = str.substring(10);
		this.op = str.charAt(0);
		String d2 = str.substring(1,11);
		DatePojo dp1 = new DatePojo(d1);
		DatePojo dp2 = new DatePojo(d2);
		String temp;
		
		if(op=='+')
		{
			this.temp = dp1.ad(dp2.getDate());
		}
		else if(op=='-')
		{
			this.temp = dp1.sub(dp2.getDate());
		}
		
		}
}
