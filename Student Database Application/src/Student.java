import java.util.Scanner;

public class Student {
	//These are private as another example of encapsulation. k
private String firstname;
private String lastname;
private int year;
private double balance;
private int uniqueID;
private String coursesEnrolled;
private int costOfCourse = 600;

// Constructors for Student : Prompt user to enter a name and year
public Student() {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter student first name");
	this.firstname= in.nextLine();
	System.out.println("Enter student last name");
	this.lastname = in.nextLine();
	System.out.println("Enter Year of Study:\n(1) for 1st Year\n(2)for 2nd Year\n(3) for 3rd Year\n(4) for 4th Year \n(5) for 5th Year\n(6) for Any other option eg. PostGrad/ Masters/Doctorate");
	this.year= in.nextInt();
	in.close();
}

// Generate Student ID
private void generateStudentID (int gradeLevel) {
	
}
// Set student balance

// Enroll in courses

// Pay tuition

// Show Status of student

}
