/**
*Author: Michael Schreiber Assignment 5.2 Part II
*Date: April 4, 2016 CSC200
*Contact Email: mxs744@gmail.com 
*This Program is designed to demonstrate the method with MathClass
 * 
 * @author Michael Schreiber
 *
 */

import java.util.Scanner;

public class MethodsII {
	public static void main(String[] args) {
		
		System.out.print("Enter two numbers with one decimal point and two digits in the hundredths places: ");
		
		double dblTest, dblTest2, A, B, C, D, E, F, G, H, I;
		
		Scanner keyboard1 = new Scanner(System.in);
		Scanner keyboard2 = new Scanner(System.in);
		
		dblTest = keyboard1.nextDouble();
		dblTest2 = keyboard2.nextDouble();
		
		A = Math.floor(dblTest);
		B = Math.ceil(dblTest);
		C = Math.abs(dblTest);
		D = Math.min(dblTest, dblTest2);
		E = Math.max(dblTest, dblTest2);
		F = Math.round(dblTest);
		G = Math.sqrt(dblTest);
		H = Math.pow(dblTest, dblTest2);
		I = Math.random();
		
		System.out.print("The first number rounded down is " + A + " The first number rounded up is " + B + " The first number rounded is " + F + "\n"
							+ "The absolute value of the first number is " + C + " The minimum between the two is " + D + " The max is " + E + "\n" 
							+ "The first number's square root is " + G + " The first number raised to the second one is " + H + "\n"
							+ "And a random number generated between 1 and 10 is " + I);
		
	}
}
