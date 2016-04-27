import java.util.Scanner;

/**
*Author: Michael Schreiber Assignment 7.1
*Date: April 25th, 2016 CSC200
*Contact Email: mxs744@gmail.com 
*This Program is designed to demonstrate how to sort an array
 * 
 * @author Michael Schreiber
 *
 */


public class Sort {
	
	//Used Z/Y/X
	static void swap(int[] Z, int Y, int X) {
		
	//Used PH for "Place Holder"
		int PH;
		PH = Z[Y];
		Z[Y] = Z[X];
		Z[X] = PH;
	}
	
	//Used swap with Z/Y/X to re-order the numbers 
	static int[] sort(int[] Z) {
		
		
		for (int Y = 0; Y < Z.length - 1; Y++) {
		for (int X = Y+1; X < Z.length; X++) {
		if (Z[Y] > Z[X]) {
		swap(Z,Y,X);
		}
		}
		}
		return Z;	
	}
	
	//Main method with input from user
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the total number of numbers you wish to sort: ");
		
		int P = input.nextInt();
		
		int[] Z = new int[P];
		
		for (int Y = 0; Y < Z.length; Y++) {
			System.out.print("Enter your next value now " + Y + ": ");
			Z[Y] = input.nextInt();
		}
		
		Z = sort(Z);
		
		System.out.print("Sorted array: ");
		for (int X = 0; X < Z.length; X++) {
		System.out.print(Z[X] + " ");
		}
	}
}
