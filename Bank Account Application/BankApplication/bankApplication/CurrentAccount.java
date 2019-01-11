package bankApplication;

public class CurrentAccount extends Account {
	// List of properties specific to a current account
	/*
	 * Debit-card
	 * Pin
	 * 2 as first digit of Account number
	 * 15% of base rate
	 * 
	 */
	private Integer debitCard;
	private Integer debitCardPin;
	
	// Constructor to initialise a checking account properties interactively
	public CurrentAccount(String name, Double initialDeposit, String socialSecurity) {
		super(name, initialDeposit, socialSecurity);
		//Add 2 ad first digit of account number
		accountNumber = 2 + accountNumber;
		setDebitCard();
	}
	
	
	// List of any methods specific to checking account
	public void showInfo() {
		super.showInfo();
		System.out.println("Account Type: Current Account"
		 + "\nDebit Card Number: " + debitCard + 
		 "\nP.I.N. : "+ debitCardPin  + 
		 "********");
	}
	
	private void setDebitCard() {
		//Generate debit card code
		debitCard = (int) (Math.random()*Math.pow(10, 12));
		//Generate pin
		debitCardPin = (int) (Math.random()+Math.pow(10, 4));
	}
	@Override
	public void setRate() {
		rate = getBaseRate()*0.15;
	}
}
