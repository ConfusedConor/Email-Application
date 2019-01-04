import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private String department;
	private int passwordLengthDefault = 8;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String company = "examplesoft";
	
	//Constructor to receive first name and last name.
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Email created for "+this.firstname+" "+this.lastname);
		// Call a method asking for the department
			this.department = setDepartment();
			//System.out.println(this.department);
				// Clearing out non-departments from department variable
				if (this.department == "No Department Set" || this.department == "No valid department set, None set as default option") {
					this.department = "";
				}
		// Call a method to return a random password
			this.password = randomPassword(passwordLengthDefault);
			//System.out.println("Password is: "+this.password);
		// Combine elements to generate email
			this.email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+company+".com";
			System.out.println(this.email);
	}
	// Ask for the department
	private String setDepartment() {
		System.out.println("Enter the Department for "+this.firstname+" "+this.lastname+": \n (1) for Sales\n (2) for Development\n (3) for Accounting\n (0) for None.");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		in.close();
		switch(depChoice) {
			case 1: return "sales.";
			case 2: return "development.";
			case 3: return "accounting.";
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
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	// Set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	// Getters - Mailbox Capacity
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	//Give all Email info method - Prints all Email account info
	public void showAllInfo() {
		System.out.println("Email account details for "+this.firstname+" "+ this.lastname+":");
		System.out.println("Display Name:    "+this.firstname+ " "+ this.lastname);
		System.out.println("Email address:   "+this.email);
		System.out.println("Password:        "+this.password);
		System.out.println("Alternate Email: "+this.alternateEmail);
		System.out.println("Mailbox Capac. : "+this.mailboxCapacity);
	}
	
}
