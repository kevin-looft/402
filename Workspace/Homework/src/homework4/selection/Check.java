package homework4.selection;

import java.util.Date;

/*
 * The Check class will have 3 properties:
 * 		checkNumber - Integer
 * 		payTo       - String
 * 		date        - Date
 */

public class Check implements Comparable<Check>{
	private Integer checkNumber;
	private String payTo;
	private Date date;
	
	public Check(Integer checkNumber, String payTo, Date date) {
		this.checkNumber = checkNumber;
		this.payTo = payTo;
		this.date = date;
	}

	public Integer getCheckNumber() {
		return this.checkNumber;
	}


	public void setCheckNumber(Integer checkNumber) {
		this.checkNumber = checkNumber;
	}


	public String getPayTo() {
		return this.payTo;
	}


	public void setPayTo(String payTo) {
		this.payTo = payTo;
	}


	public Date getDate() {
		return this.date;
	}


	public void setDate(Date date) {
		this.date = date;
	}

	
	@Override
	public String toString() {
		return "Check [checkNumber=" + checkNumber + ", payTo=" + payTo + ", date=" + date + "]";
	}

	@Override
	public int compareTo(Check check) {
		return this.checkNumber.compareTo(check.checkNumber);
	}


}
