package task1;

public class BankDetails {

	private String accountNumber;
	private String accountHolder;
	private double balance;
	
	BankDetails(String accountNumber,String accountHolder)
	{
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		
	}
	public BankDetails(String accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public String getBankDetails() {
		return "BankDetails [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance="
				+ balance + "]";
	}
	

	
}
