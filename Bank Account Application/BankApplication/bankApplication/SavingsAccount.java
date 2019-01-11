package bankApplication;

public class SavingsAccount extends Account{
	// List of properties specific to a savings account
		/*
		 * Safe-deposit box
		 * 4 digit code
		 * 1 as first digit of Account number
		 * base rate .25 points down
		 */
		
		private Integer safeDeposit;
		private Integer depositPin;
		// Constructor to initialise a savings account properties
		 public SavingsAccount(String name, Double initialDeposit, String socialSecurity) {
			super(name, initialDeposit, socialSecurity);
			// Add 1 as first digit of account number
				accountNumber = 1 + accountNumber;
			// Set safe Deposit Box
				setSafetyDepositBox();
			
		 }
		// List of any methods specific to savings account
		 private void setSafetyDepositBox() {
			//Unique 3 digit Safe deposit box
				safeDeposit = (int) (Math.random() * Math.pow(10, 3));
			// Create 4 digit code
				depositPin = (int) (Math.random() + Math.pow(10, 4));
		 }
		 
		 public void showInfo() {
				super.showInfo();
				System.out.println("Account Type: Savings Account"
				 + "\nSafe-Deposit Box: " + safeDeposit + 
				 "\nEntry Code: "+ depositPin + 
				 "********");
			}
		@Override
		public void setRate() {
			rate = getBaseRate() - 0.25;			
		}
}
