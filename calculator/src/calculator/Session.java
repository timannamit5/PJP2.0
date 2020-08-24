package calculator;

import java.io.Serializable;
import java.util.List;


public class Session implements Serializable{
	
	private String in;
	private String out;
	
	public String getIn() {
		return in;
	}

	public void setIn(String in) {
		this.in = in;
	}

	public String getOut() {
		return out;
	}

	public void setOut(String out) {
		this.out = out;
	}
	
	public String output() {
		return "input : " +this.in + " output : " + this.out +" \n";
	}	

}
