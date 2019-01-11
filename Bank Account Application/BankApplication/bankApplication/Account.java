package bankApplication;

import java.util.Random;
import java.util.Scanner;

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
	private String firstName;
	private String surname;
	private Double balance;
	static Integer uniqueNum = 10000;
	private Double initialDeposit;
	private String socialSecurity;
	/*
	 * Could have also been an integer, but seeing as it doesnt require maths this
	 * works just fine, and allows us to use it as SSN or National Insurance.
	 */
	protected String accountNumber = "";

	// Constructor to set base properties and initialise account in interactive way
	public Account() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the firstname of the new account holder: ");
		firstName = in.next();
		System.out.print("Please enter the surname of the new account holder: ");
		surname = in.next();
		System.out.print("Please enter " + firstName + " " + surname + "'s Social Security Number : ");
		socialSecurity = in.next();
		System.out.print("What is the opening deposit? : £");
		initialDeposit = in.nextDouble();
		balance = initialDeposit;
		// Call accountNumber Generator
		generateAccountNum();
		// get BaseRate

	}

	// Overloading... 
	// Probably the contructor I'll actually use
	public Account(String firstName, String surname, Double initialDeposit, String socialSecurity) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.balance = initialDeposit;
		this.initialDeposit = initialDeposit;
		this.socialSecurity = socialSecurity;
		generateAccountNum();
	}

	// Account number generator
	private void generateAccountNum() {
		// Last two digits of social Security number
			//Original Design of this section.. followed my new, cleaner method.
//			char[] array = socialSecurity.toCharArray();
//			accountNumber = accountNumber + array[array.length - 2] + array[array.length - 1];
		accountNumber = accountNumber + socialSecurity.substring(socialSecurity.length() - 2, socialSecurity.length());
		// Unique 5 digit number
		accountNumber = accountNumber + uniqueNum;
		uniqueNum++;
		// Random 3 digit number
			//Original Method I used
//			Random random = new Random();
//			accountNumber = accountNumber + random.nextInt(10) + random.nextInt(10) + random.nextInt(10);
			//Simplified method 1 line of code instead of two.
		accountNumber = accountNumber + (int) (Math.random() * Math.pow(10, 3));
	}

	// List methods common to both account types
	public String accountInfo() {
		return "Name: " + firstName + " " + surname + "\nSocial Security: " + socialSecurity + "\nAccount Number: "
				+ accountNumber + "\nBalance: £" + balance;
	}
}
