import java.util.Scanner;

public class Student {
	//These are private as another example of encapsulation. k
private String firstname;
private String lastname;
private int year;
private double totalCourseCosts = 0;
private String uniqueID;
private String coursesEnrolled = "";
private static int costOfCourse = 600;
private static int id = 1000;
// Constructors for Student : Prompt user to enter a name and year
public Student() {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter student first name");
	this.firstname= in.nextLine();
	System.out.println("Enter student last name");
	this.lastname = in.nextLine();
	System.out.println("Enter Year of Study:\n(1) for 1st Year\n(2)for 2nd Year\n(3) for 3rd Year\n(4) for 4th Year \n(5) for 5th Year\n(6) for Any other option eg. PostGrad/ Masters/Doctorate");
	this.year= in.nextInt();
	in.nextLine();
	//Closing scanners caused issues. So currently commented out
	//in.close();
	setID();
}

// Generate Student ID
private void setID() {
	//Grade year + ID
	uniqueID =  year+""+id;
	//Incriment ID so each student has a unique value
	id++;
}
// Set student balance

// Enroll in courses
public void enroll() {
	//Create a loop with an exit option (Q)
	do {
		System.out.println("Enter Course to enroll, or 'Q' to quit: ");
		Scanner enroll = new Scanner(System.in);
		enroll.useDelimiter("\\n");
		String course = enroll.nextLine();
		if (!course.equalsIgnoreCase("Q")) {
			coursesEnrolled = coursesEnrolled+"\n"+course;
			totalCourseCosts = totalCourseCosts + costOfCourse;
		}
		else {break;}
	}while(1 != 0);
	
	//Print it out
	System.out.println("Enrolled in: "+coursesEnrolled);
	System.out.println("Tuition for these courses will cost: £"+totalCourseCosts);
	//enroll.close();
}
// Pay tuition

// Show Status of student
public String showStudent() {
	return firstname + " " + lastname + ".\nYear of Study: "+year+".\nStudentID: "+uniqueID;
}

}
