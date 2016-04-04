/**
*Author: Michael Schreiber Exercise 4.2 Debug Loop 
*Date: March 30, 2016 CSC200
*Contact Email: mxs744@gmail.com 
*This Program is designed to output the first 50 odd/even numbers while looping/ draw a diamond shape
 * 
 * @author Michael Schreiber
 *
 */
public class Diamond {
	
	public static void main(String[]args){
		
		int LimitOdd = 50;
		int LimitEven = 50;
		int i2 =2;
		int Asterisk =0;
		System.out.println("Here are the first odd numbers up to " + LimitOdd);
		
		for(int i=1; i <= LimitOdd; i++){
			
			if(i% 2 != 0){
				System.out.print(i+"");
			}	
		}
		
		System.out.println("\nHere are the first even numbers up to " + LimitEven);
		do {
			
		System.out.println(i2+"");
		i2=i2+2;
			
		}while(i2<=50);
			
		while(Asterisk<8)
		{
			switch(Asterisk)
			{
			case(1):
				System.out.println("     *");
				break;
			case(2):
				System.out.println("    ***");
			 	break;
			case(3):
				System.out.println("   *****"); 
				break;
			case(4):
				System.out.println("  *******"); 
				break;
			case(5):
				System.out.println("   *****"); 
				break;
			case(6):
				System.out.println("    ***");
				break;
			case(7):
				System.out.println("     *");
				break;
				
			}
			Asterisk++;
		}
		
	
}
}
