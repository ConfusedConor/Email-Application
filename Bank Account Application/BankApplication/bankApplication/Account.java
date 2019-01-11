package bankApplication;

//Common Properties of both accounts
/* 
 * Name
 * Initial Deposit
 * Balance
 * Account number (minus the first digit)
 * Social security number
 * 
 */

public abstract class Account implements BaseRate {
	private String name;
	private Double balance;
	static Integer uniqueNum = 10000;
	private String socialSecurity;
	/*
	 * Could have also been an integer, but seeing as it doesnt require maths this
	 * works just fine, and allows us to use it as SSN or National Insurance.
	 */
	protected String accountNumber = "";
	protected double rate;

	// Account Constructor of common features
	public Account(String name, Double initialDeposit, String socialSecurity) {
		super();
		this.name = name;
		this.balance = initialDeposit;
		this.socialSecurity = socialSecurity;
		generateAccountNum();
		setRate();
	}

	// Account number generator
	private void generateAccountNum() {
		// Last two digits of social Security number
		this.accountNumber = accountNumber + socialSecurity.substring(socialSecurity.length() - 2, socialSecurity.length());
		// Unique 5 digit number
		this.accountNumber = accountNumber + uniqueNum;
		uniqueNum++;
		// Random 3 digit number
		this.accountNumber = accountNumber + (int) (Math.random() * Math.pow(10, 3));
	}
	
	// Method used in child classes to set interest rate
	public abstract void setRate();
	
	//Method to compound Interest
	public void compound() {
		double accruedInterest = balance * (rate/100);
		System.out.println("Accrued interest: £" + accruedInterest);
		balance = balance + accruedInterest;
	}
	
	// List methods common to both account types
	public void showInfo() {
		System.out.println( "Name: " +name + "\nSocial Security: " + socialSecurity + "\nAccount Number: "
				+ accountNumber + "\nBalance: £" + balance);
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing £"+ amount);
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing £"+ amount);
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transferring £"+ amount + " to " + toWhere);
	}
	
	public void printBalance() {
		System.out.println("Your balance is now £"+balance);
	}
}
