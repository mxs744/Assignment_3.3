/**
*Michael Schreiber
*Assignment 3.5 Grade Program
*Contact Email: mxs744@gmail.com
*This program is designed to switch case depending on the user input
*/

import java.util.Scanner;

public class GradeProgram {
	public static void main(String[] args) {

	//Initialize here
	System.out.println("Enter your user class, 1 for Administrator, 2 for Faculty, 3 for Staff, 4 for Student, or 5 for Guest.");
	Scanner keyboard = new Scanner(System.in);

	int Case = keyboard.nextInt();
	switch(Case) {
	case 1: 
		System.out.println("Welcome, Administrator!");
		break;
	case 2:
		System.out.println("Welcome, Faculty Member!");
		break;
	case 3:
		System.out.println("Welcome, Staff Member!");
		break;
	case 4:
		System.out.println("Welcome, Student!");
		break;
	case 5:
		System.out.println("Welcome, Guest!");
		break;
	}
}

}

