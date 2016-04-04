/** 
*Author: Michael Schreiber Assignment # 1A Extra Credit
*Date: April 4, 2016 CSC200
*Contact Email: mxs744@gmail.com
*This program is designed to take use scanner to take a float point value and manipulate it
*
* @author Michael Schreiber
*
*/

import java.util.Scanner;

public class AssignmentOneA {
	public static void main(String [] args) {
	
	String strX = "";

	Double dblX, dblY; 
	Scanner keyboard1 = new Scanner(System.in);
	System.out.println("Enter a value for x between 2e-11 and 2e11 please: ");

	strX = keyboard1.next();
	dblX = Double.parseDouble(strX);
	dblY = 1/ dblX;

	System.out.println("X = " + dblX + " Y = " + dblY + " The product of X and Y is " + (dblX*dblY) + " Subtract 1 from that and the result is " + 0);


}

}


