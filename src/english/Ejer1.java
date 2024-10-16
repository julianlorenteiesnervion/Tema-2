package english;

import java.util.*;

public class Ejer1 {

	public static void main(String[] args) {
		// Creating the Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declare variables
		int num = 0;
		
		int totalEven = 0;
		int totalOdd = 0;
		
		System.out.print("Type a number: ");
		num = reader.nextInt();
		
		while (num >= 0) {
			System.out.print(num % 2 == 0 ? "The number is even" : "The number is odd");
			
			if (num % 2 == 0) {
				totalEven++;
			} else {
				totalOdd++;
			}
			
			System.out.print("\nType another number: ");
			num = reader.nextInt();
		}
		System.out.print("The user has typed " + totalEven + " even numbers and " + totalOdd + " odd numbers.");
		
		reader.close();
		

	}

}
