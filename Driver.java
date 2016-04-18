
public class Driver {

	public static void main(String [] args) {
		
		double[] Num = new double[5];
		
		Num[0] = 1.0;
		Num[1] = 2.0;
		Num[2] = 3.0;
		Num[3] = 4.0;
		Num[4] = 5.0;
		
		System.out.println("The Sum is " + Calculator.Sum(1.0,7.0));
		System.out.println("The Product is " + Calculator.Product(1.0,7.0));
		System.out.println("The Average is " + Calculator.Average(1.0,7.0));
		System.out.println("The Factorial is " + Calculator.Factorial(7.0));
	}
	
}
