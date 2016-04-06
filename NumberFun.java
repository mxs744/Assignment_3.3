/** 
 *Author: Michael Schreiber CSC 200
 *Date: April 6, 2016
 *Contact Email: mxs744@gmail.com
 *Assignment 2 Extra Credit Part 2: Numbers are fun
 * @author ms22472
 *
 */
import java.util.Scanner;

public class NumberFun {
	public static void main(String[] args){
		
	double num1, num2, num3, num4, num5, sum, average;
	
	System.out.println("Enter five numbers please: ");
	
	Scanner one = new Scanner(System.in);
	num1 = one.nextDouble();
	Scanner two = new Scanner(System.in);
	num2 = two.nextDouble();
	Scanner three = new Scanner(System.in);
	num3 = three.nextDouble();
	Scanner four = new Scanner(System.in);
	num4 = four.nextDouble();
	Scanner five = new Scanner(System.in);
	num5 = five.nextDouble();
	
	sum = num1+num2+num3+num4+num5;
	average = sum/5;
	
	System.out.println("The sum of your numbers is " + sum + " The average of your numbers is " + average);
	
		
	}

}
