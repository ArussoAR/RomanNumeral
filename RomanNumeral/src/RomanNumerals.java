import java.util.Scanner;

public class RomanNumerals {
	       
	private static String hundred;
	private static String mM;

	public static void main(String[] args)
	{
		try (Scanner Alex = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int integer = Alex.nextInt();
			mM = "";
			hundred = "";
			
			if (integer >= 1000)
			{
				//find 1000 digit
			int number = integer / 1000;
			if (number == 1) {
				System.out.print("M");
			}
			
			if (number == 2) {
				System.out.print("MM");
			}
				
			if (number == 3) {
				mM="MM";	
			}
			
			// find the 100 digit
			if (number >= 100) {
			int number1 = (integer/ 100) % 10;
			if (number1 ==1)
				System.out.print("C");
			}
			
			// find the 10 digit
			if (number >= 10) {
			int number2 = (integer/ 10);
			if (number2 ==1)
				System.out.print("X");
			
			}
			// find the 5 digit
			if (number >= 5) {
			int number3 = (integer/ 5);
			if (number3 ==1)
				System.out.print("V");
			}
			
			// find the 1 digit
			if (number >= 1) {
			int number4 = (integer/ 100) % 10;
			if (number4==1)
				System.out.print("I");
			}
			}
		}
	
		
		
	}
	}
	    
		
	
