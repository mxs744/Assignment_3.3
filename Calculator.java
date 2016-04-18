
public class Calculator {

		public static double Average(double One, double Two) {
			return (One+Two)/2.0;
			
		}
		
		public static double Average(double[] Num) {
			double average = 0;
			double sum = 0;
			
			for (int i = 0; i < Num.length; i++) {
				sum = sum+Num[i];
			}
			return (sum/Num.length);
			}
		
		
		
		public static double Sum(double One, double Two) {
			return (One+Two);
		}
		
		public static double Sum(double[] Num) {
			double sum = 0;
			for (int i = 0; i < Num.length; i++) {
				sum += Num[i];
				
			}
			return sum;
			
		}
		public static double Product(double One, double Two) {
			return (One*Two);
			
		}
		
		public static double Product(double[] Num) {
			double product = 0;
			for (int i = 0; i < Num.length; i++) {
				product *= Num[i];
			}
			return product;
		}
		
		public static double Factorial(double One) {
			double factorial = 1.0;
			for(double i = 1; i <= One; i++) {
				factorial  *= i;
				
			}
			return factorial;
		}
}
