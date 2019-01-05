/**	
 * For this application I will be taking the role of a Database Admin
 * for a University, where I need to create an application to manage student
 * Enrolments and balance.
 *
 *	Application should:
 *		*Ask the user how many new students will be added to the database
 *		*The user should be prompted to enter the name and year for each student
 *		* The student should have a 5-digit ID, with the first number being their grade level
 *		*A student can enroll in the following:
 *				*History 101
 *				*Mathematics 101
 *				*English 101
 *				*Chemistry 101
 *				*Comp.Science 101
 *		*Each course costs £600 to enroll
 *		*The student should be able to view their balance and pay the tuition
 *		*To see the status of the student we should see their name, ID, courses enrolled & balance
 */

public class DatabaseApplication {

	public static void main(String[] args) {
		
		//Ask how many new users to add
		//System.out.println("How many new students do you wish to add?");
		
		// Create n number of students
		Student student1 = new Student();
		student1.enroll();
		
	}

}
