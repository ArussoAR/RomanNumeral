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
			}
		}
	
		
		
	}
	}
	    
		
	
