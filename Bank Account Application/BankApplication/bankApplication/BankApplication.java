package bankApplication;
/* For this application I will be taking the role of a back-end Dev who has been
 * tasked with creating an application to handle new customer bank account requests
 * The application should: 
 * 		* Read a .csv file if names, social-security numbers, account type and initial deposits
 * 		* Use a proper data structure to hold all these accounts
 * 		* Both savings and current accounts should have these functions:
 * 				* deposit()
 * 				* withdraw()
 * 				* transfer()
 * 				* showInfo()
 * 				* an 11 digit account number (generated from: 1/2 depending on account type, last 2 digits of SSN, a unique 5 digit number, & a random 3 digit number)
 * 		* Savings accounts should have a safety deposit box, with a 3 digit identifier and accessed with a 4 digit pin.
 * 		* Current accoutns should be assigned a Debit card with 12 digits and 4-digit PIN
 * 		* Both accounts will use an interface that detemines the base interest rate
 * 		* Savings accounts will use .25 points less than the base rate
 * 		* Current accounts will use 15% of the base rate
 * 		* ShowInfo method should show the relevant info to the type of account
 */
public class BankApplication {

	public static void main(String[] args) {
		CurrentAccount account1 = new CurrentAccount();
		
		
		//Read CSV file and create new accounts

	}

}
