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
		accountNumber = accountNumber + socialSecurity.substring(socialSecurity.length() - 2, socialSecurity.length());
		// Unique 5 digit number
		accountNumber = accountNumber + uniqueNum;
		uniqueNum++;
		// Random 3 digit number
		accountNumber = accountNumber + (int) (Math.random() * Math.pow(10, 3));
	}

	// List methods common to both account types
	public void showInfo() {
		System.out.println( "Name: " +name + "\nSocial Security: " + socialSecurity + "\nAccount Number: "
				+ accountNumber + "\nBalance: £" + balance);
	}
	public abstract void setRate();
}
