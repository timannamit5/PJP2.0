package week2_assignment_3;

public class swap {
	
	entryPojo temp = new entryPojo();
	
	public void swap(entryPojo a, entryPojo b)
	{
		this.temp.setCity(a.getCity());
		this.temp.setCountry(a.getCountry());
		this.temp.setGender(a.getGender());
		this.temp.setCurrency(a.getCurrency());
		this.temp.setAmount(a.getAmount());
		
		a.setCity(b.getCity());
		a.setCountry(b.getCountry());
		a.setGender(b.getGender());
		a.setCurrency(b.getCurrency());
		a.setAmount(b.getAmount());
		
		b.setCity(this.temp.getCity());
		b.setCountry(this.temp.getCountry());
		b.setGender(this.temp.getGender());
		b.setCurrency(this.temp.getCurrency());
		b.setAmount(this.temp.getAmount());
		
		
	}

}
