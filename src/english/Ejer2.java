package english;

import java.util.*;

public class Ejer2 {

	public static void main(String[] args) {
		// Create the Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declare variables
		int num;
		int counter = 0;
		
		// We ask the user for a number
		System.out.print("Type a number: ");
		num = reader.nextInt();
		
		/* While the number isn't the same as 10, we'll keep multiplying
		 * the number but with the next digit up to 10 */
		while (counter != 10) {
			counter++;
			System.out.print("\n" + num + " x " + counter + " = " + (num * counter));
		}
		
		reader.close();

	}

}
