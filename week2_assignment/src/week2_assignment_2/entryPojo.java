package week2_assignment_2;

public class entryPojo {

	String transactionId;
	String clientId;
	String securityId;
	String transType;
	String transDate;
	String value;
	String flag;
	
	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String x) {
		this.transactionId = x;
	}
	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String x) {
		this.clientId = x;
	}
	public String getSecurityId() {
		return this.securityId;
	}
	public void setSecurityId(String x) {
		this.securityId = x;
	}
	public String getTransType() {
		return this.transType;
	}
	public void setTransType(String x) {
		this.transType = x;
	}
	public String getTransDate() {
		return this.transDate;
	}
	public void setTransDate(String x) {
		this.transDate = x;
	}
	public String getValue() {
		return this.value;
	}
	public void setValue(String x) {
		this.value = x;
	}
	public String getFlag() {
		return this.flag;
	}
	public void setFlag(String x) {
		this.flag = x;
	}
	public int calculate() {
		int cost = 0;
		
		if(this.flag=="Y")
		{
			cost+=500;
		}
		else if(this.flag=="N")
		{
			if(this.transType=="Sell" || this.transType=="Withdraw")
			{
				cost+=100;
			}
			else 
			{
				cost+=50;
			}
		}

		return cost;
	}
	
}
