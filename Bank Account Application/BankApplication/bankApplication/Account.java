package bankApplication;

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
private double balance;
private double initialDeposit;
private String socialSecurity; 
/*Could have also been an integer, but seeing as it doesnt require maths
 *  this works just fine, and allows us to use it as SSN or National Insurance.
 */
private String accountNumber;								

	// Constructor to set base properties and initialise account
public Account() {
	Scanner in = new Scanner(System.in);
	System.out.print("Please enter the firstname of the new account holder: ");
	firstName = in.next();
	System.out.print("Please enter the surname of the new account holder: ");
	surname = in.next();
	System.out.print("Please enter " + firstName + " " + surname + "'s Social Security Number : " );
	socialSecurity = in.next();
}
	// List methods common to both account types

}
