import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int passwordLengthDefault = 8;
	private int mailboxCapacity;
	private String alternateEmail;
	
	//Constructor to receive first name and last name.
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Email created for "+this.firstname+" "+this.lastname);
		// Call a method asking for the department
		this.department = setDepartment();
		System.out.println(this.department);
		// Call a method to return a random password
		this.password = randomPassword(passwordLengthDefault);
		System.out.println("Password is: "+this.password);
	}
	// Ask for the department
	private String setDepartment() {
		System.out.println("Enter the Department for "+this.firstname+" "+this.lastname+": \n (1) for Sales\n (2) for Development\n (3) for Accounting\n (0) for None.");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		in.close();
		switch(depChoice) {
			case 1: return "Sales";
			case 2: return "Development";
			case 3: return "Accounting";
			case 0: return "No Department Set";
			default: return "No valid department set, None set as default option";
		}
	}
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$£%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i]= passwordSet.charAt(rand);	
		}
		return new String(password);
	}
	
	// Set mailbox capacity
	
	// Set alternate email
	
	// Change the password
}
