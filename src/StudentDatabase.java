package StudentDatabase;

import java.util.Scanner;

public class StudentDatabase {
	
	public static void main(String[] args) {
		
		
	   // Ask how many Students to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
	   // Create a new number of students
		for (int n=0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
		  
		}
	}
	
}


