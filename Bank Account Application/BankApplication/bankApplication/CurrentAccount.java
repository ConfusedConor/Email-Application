package bankApplication;

import java.util.Random;

public class CurrentAccount extends Account {
	// List of properties specific to a current account
	/*
	 * Debit-card
	 * Pin
	 * 2 as first digit of Account number
	 * 15% of base rate
	 * 
	 */
	private String debitCard;
	private String debitCardPin;
	private String debitCardBase= "0000-0000-";
	
	
	// Constructor to initialise a checking account properties interactively
	public CurrentAccount(String name, Double initialDeposit, String socialSecurity) {
		super(name, initialDeposit, socialSecurity);
		//Add 2 ad first digit of account number
		accountNumber = 2 + accountNumber;
		
		//Generate debit card code
		Random random = new Random();
		debitCard = debitCardBase + random.nextInt(10) + random.nextInt(10) +random.nextInt(10) + random.nextInt(10) + "-" +
				random.nextInt(10) + random.nextInt(10) +random.nextInt(10) + random.nextInt(10);
		//Generate pin
		debitCardPin = "" + random.nextInt(10) + random.nextInt(10) + random.nextInt(10) + random.nextInt(10);
	}
	
	
	// List of any methods specific to checking account
	public void showInfo() {
		super.showInfo();
		System.out.println("Account Type: Current Account"
		 + "\nDebit Card Number: " + debitCard + 
		 "\nP.I.N. : "+ debitCardPin  + 
		 "********");
	}
	
}
