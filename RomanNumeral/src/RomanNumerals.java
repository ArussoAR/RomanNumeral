import java.util.Scanner;

public class RomanNumerals {
	       

	public static void main(String[] args) {
		
		Scanner Alex = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
			
		int integer = Alex.nextInt();
		
		int integer1 = 0;
		int integer2 = 0;
		int integer3 = 0;
		int integer4 = 0;
		
			if (integer >= 1000)
			{
				//find 1000 digit
			integer1 = integer / 1000;
			
			if (integer1 == 1) {
				System.out.print("M");
			}
			
			if (integer2 == 2) {
				System.out.print("MM");
			}
				
			if (integer3 == 3) {
				System.out.print("MMM");
			}
			}
			
			// find the 100 digit
			if (integer >= 100) {
			
				integer2 = (integer/ 100) % 10;
				
			if (integer2 ==1) {
				System.out.print("C");
			}
			if (integer2 ==2) {
				System.out.print("CC");
			}
			if (integer2 ==3) {
				System.out.print("CCC");
			}
			if (integer2 ==4) {
				System.out.print("CD");
			}
			if (integer2 ==5) {
				System.out.print("D");
			}
			if (integer2 ==6) {
				System.out.print("DC");
			}
			if (integer2 ==7) {
				System.out.print("DCC");
			}
			if (integer2 ==8) {
				System.out.print("DCCC");
			}
			if (integer2 ==9) {
				System.out.print("CM");
			}
			}
			

			// find the 10 digit
			if (integer >= 10) {
				
		integer3 = (integer/ 10);
		
			if (integer3 ==1) {
				System.out.print("X");
			}
			if (integer3 ==2) {
				System.out.print("XX");
			}
			if (integer3 ==3) {
				System.out.print("XXX");
			}
			if (integer3 ==4) {
				System.out.print("XL");
			}
			if (integer3 ==5) {
				System.out.print("L");
			}
			if (integer3 ==6) {
				System.out.print("LX");
			}
			if (integer3 ==7) {
				System.out.print("LXX");
			}
			if (integer3 ==8) {
				System.out.print("LXXX");
			}
			if (integer3 ==9) {
				System.out.print("XC");
			}
			}
			
		
			// find the 1 digit
			if (integer >= 1) {
				
				integer4 = (integer/ 100) % 10;
				
			if (integer4 ==1) {
				System.out.print("I");
			}
			if (integer4 ==2) {
				System.out.print("II");
			}
			if (integer4 ==3) {
				System.out.print("III");
			}
			if (integer4 ==4) {
				System.out.print("IV");
			}
			if (integer4 ==5) {
				System.out.print("V");
			}
			if (integer4 ==6) {
				System.out.print("VI");
			}
			if (integer4 ==7) {
				System.out.print("VII");
			}
			if (integer4 ==8) {
				System.out.print("VIII");
			}
			if (integer4 ==9) {
				System.out.print("IX");
			}
			}
			
		System.out.println(integer1);
		System.out.println(integer2);
		System.out.println(integer3);
		System.out.println(integer4);
		}
	}
	    
		
	
