/**
*Author: Michael Schreiber Assignment 5.2
*Date: April 4, 2016 CSC200
*Contact Email: mxs744@gmail.com 
*This Program is designed to demonstrate the method
 * 
 * @author Michael Schreiber
 *
 */

import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {

		int x = input('x');
		int y = input('y');
		int z = input('z');
		System.out.println(h(x));
		System.out.println(f(x,y));
		System.out.println(g(x,y,z));
	}
	
	//Power 10
	static double h(int x) {
		return Power(x,10);
	}
	
	//Add x and y
	static double f(int x, int y) {
		return x + y;
	}
	
	//Root plus abs value plus power
	static double g(int x, int y, int z) {
		return (Sqrt(x) + Absolute(y) + Power(z,y));
	}
	
	//Raise to inidcated power
	static double Power(int num, int pow) {
		if (pow == 0) 
			return 1;
		else 
			return num * Power(num,pow-1);
	}
	
	//Take abs value
	static double Absolute(int num) {
		if (num < 0) return -num;
		else return num;
	}
	
	//Manual method for square root without using mathclass
	static double Sqrt(int num) {
		double a, sqrt = num / 2; 
		do {
			a = sqrt;
			sqrt = (a + (num/a))/2;
		} while ((a-sqrt)!=0);
		return sqrt;
	}
	
	//Output
	static int input(char Test) {
		Scanner One = new Scanner(System.in);
		System.out.print("Enter value for " + Test + " : ");
		return One.nextInt();
	}
}	
		
		
		
		
		