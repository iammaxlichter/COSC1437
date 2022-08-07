package CHAPTER8;

public class CertOfDeposit {
	private String certNum;
	private String lastName;
	private double balance;
	private int monthOfIssue;
	private int dayOfIssue;
	private int yearOfIssue;
	
	public CertOfDeposit(String certNum, String lastName, double balance, int monthOfIssue, int dayOfIssue,
			int yearOfIssue) {
		this.certNum = certNum;
		this.lastName = lastName;
		this.balance = balance;
		this.monthOfIssue = monthOfIssue;
		this.dayOfIssue = dayOfIssue;
		this.yearOfIssue = yearOfIssue;
	}
	public int getMonthOfIssue() {
		return monthOfIssue;
	}
	public void setMonthOfIssue(int monthOfIssue) {
		this.monthOfIssue = monthOfIssue;
	}
	public int getDayOfIssue() {
		return dayOfIssue;
	}
	public void setDayOfIssue(int dayOfIssue) {
		this.dayOfIssue = dayOfIssue;
	}
	public int getYearOfIssue() {
		return yearOfIssue;
	}
	public void setYearOfIssue(int yearOfIssue) {
		this.yearOfIssue = yearOfIssue;
	}
	public void setCertNum(String certNum) {
		this.certNum = certNum;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCertNum() {
		return certNum;
	}
	public String getLastName() {
		return lastName;
	}
	public double getBalance() {
		return balance;
	}
	public String getIssueDate() {
        if (monthOfIssue >= 0 && monthOfIssue <=9 && dayOfIssue >= 0 && dayOfIssue <=9){
            return yearOfIssue+"-0"+monthOfIssue+"-0"+dayOfIssue;
        }
        if (monthOfIssue >= 0 && monthOfIssue <=9){
            return yearOfIssue+"-0"+monthOfIssue+"-"+dayOfIssue;
        }
        if (dayOfIssue >= 0 && dayOfIssue <=9){
            return yearOfIssue+"-"+monthOfIssue+"-0"+dayOfIssue;
        }
        else{
            return yearOfIssue+"-"+monthOfIssue+"-"+dayOfIssue;
        }
		
	}
	public String getMaturityDate() {
		int maturitYear=yearOfIssue+1;
        if (monthOfIssue >= 0 && monthOfIssue <=9 && dayOfIssue >= 0 && dayOfIssue <=9){
            return maturitYear+"-0"+monthOfIssue+"-0"+dayOfIssue;
        }
        if (monthOfIssue >= 0 && monthOfIssue <=9){
            return maturitYear+"-0"+monthOfIssue+"-"+dayOfIssue;
        }
        if (dayOfIssue >= 0 && dayOfIssue <=9){
            return maturitYear+"-"+monthOfIssue+"-0"+dayOfIssue;
        }
        else{
            return maturitYear+"-"+monthOfIssue+"-"+dayOfIssue;
        }
		
	}
}

