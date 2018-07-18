package Lab3;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a number 1 through 100: ");
		int num = scnr.nextInt();//user input
		
		if ( num % 2 == 0 && num > 2 && num <= 25)//program will run according to rules list
	         System.out.println(num + " is even and less than 25");
		else if (num % 2 == 0 && num >= 26 && num <= 60)
			System.out.println(num + " is Even");
		else if (num % 2 == 0 && num > 60)
			System.out.println(num + " is Even");
		else if (num % 2 != 0 && num > 60)
			System.out.println(num + " is odd and over 60.");
	      else
	         System.out.println(num + " is odd.");
		
	}
}
