/**
*Author: Michael Schreiber Assignment # 1 Extra Credit 
*Date: April 4, 2016 CSC200
*Contact Email: mxs744@gmail.com 
*This Program is designed to take a line of text and move the first word to the end of the line
 * 
 * @author Michael Schreiber
 *
 */
import java.util.Scanner;

public class AssignmentOne {
	public static void main(String [] args) {
		
		System.out.print("Enter your test please, no punctuation: ");
		Scanner cti = new Scanner(System.in);
		String A = cti.nextLine();
		System.out.print("Enter number of positions: ");
		int B = cti.nextInt();
		
		String result = new StringBuilder(A).delete(0, B).append(A.substring(0,B)).toString();
		
		System.out.println(result);
		
		
	}
}
