package bankApplication;

import java.util.Random;

public class SavingsAccount extends Account{
	// List of properties specific to a savings account
		/*
		 * Safe-deposit box
		 * Pin
		 * 1 as first digit of Account number
		 * base rate .25 points down
		 */
		
		private String safeDeposit;
		private String depositPin;
		// Constructor to initialise a savings account properties
		 public SavingsAccount() {
			//Add 1 as first digit of account number
				accountNumber = 1 + accountNumber;
				
			//Unique 3 digit Safe deposit box
				Random rand = new Random();
				safeDeposit = ""+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10);
			
		 }
		// List of any methods specific to savings account
}
