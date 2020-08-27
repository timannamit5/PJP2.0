package week2_assignment_3;

public class entryPojo {
	private String City;
	private String Country;
	private String Gender;
	private String Currency;
	private String amount;
	
	public void setCity(String x) {
		this.City = x;
	}
	public String getCity() {
		return this.City;
	}
	public void setCountry(String x) {
		this.Country = x;
	}
	public String getCountry() {
		return this.Country;
	}
	public void setGender(String x) {
		this.Gender = x;
	}
	public String getGender() {
		return this.Gender;
	}
	public void setCurrency(String x) {
		this.Currency = x;
	}
	public String getCurrency() {
		return this.Currency;
	}
	public void setAmount(String x) {
		this.amount = x;
	}
	public String getAmount() {
		return this.amount;
	}
	public String calculate()
	{
		double amt = 0;

		if(this.Currency=="INR")
			amt = (float) (Double.parseDouble(this.amount) / 66.0);
		else if(this.Currency=="HKD")
			amt = (float) (Double.parseDouble(this.amount) / 8.0);
		else if(this.Currency=="SGP")
			amt = (float) (Double.parseDouble(this.amount) / 1.5);
		else if(this.Currency=="GBP")
			amt = (float) (Double.parseDouble(this.amount) / 0.67);
		else
			return this.amount;
		
		return String.valueOf(amt);
	}
	
}
