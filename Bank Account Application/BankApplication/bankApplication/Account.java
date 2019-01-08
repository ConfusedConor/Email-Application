package bankApplication;

import java.security.SecureRandom;
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

public class Account implements BaseRate {
private String firstName;
private String surname;
private double balance;
private int uniqueNum= 10000;
private double initialDeposit;
private String socialSecurity; 
/*Could have also been an integer, but seeing as it doesnt require maths
 *  this works just fine, and allows us to use it as SSN or National Insurance.
 */
private String accountNumber = "";								

	// Constructor to set base properties and initialise account
public Account() {
	Scanner in = new Scanner(System.in);
	System.out.print("Please enter the firstname of the new account holder: ");
	firstName = in.next();
	System.out.print("Please enter the surname of the new account holder: ");
	surname = in.next();
	System.out.print("Please enter " + firstName + " " + surname + "'s Social Security Number : " );
	socialSecurity = in.next();
	System.out.print("What is the opening deposit? : ");
	initialDeposit = in.nextDouble();
	balance = initialDeposit;
	//Call accountNumber Generator
	generateAccountNum();
	//Print out
	System.out.println(firstName+ " "+ surname+" "+ socialSecurity+ " " + balance + " "+ accountNumber );
}

	// Account number generator
private void generateAccountNum() {
		//Last two digits of social Security number
		char[] array = socialSecurity.toCharArray();
		accountNumber = accountNumber +array[array.length-2] + array[array.length-1];
		// Unique 5 digit number
		accountNumber = accountNumber + uniqueNum;
		uniqueNum++;
		// Random 3 digit number
		Random random = new Random();
		accountNumber = accountNumber+ random.nextInt(10) + random.nextInt(10) + random.nextInt(10);

}
	// List methods common to both account types

}
