package english;

import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		// Create the Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaring the variables
		double introducedHeight = 0;
		double minHeight = 0;
		double maxHeight = 0;
		
		// We ask the user to type a height
		System.out.print("Type a height: ");
		introducedHeight = reader.nextInt();
		
		/* The minimum and maximum height will be, at least for now, the first
		 * introduced height */
		minHeight = introducedHeight;
		maxHeight = introducedHeight;
		
		/* While where we check if the introduced height isn't 0.
		 * If it's not 0, then we update the values like this: */
		while (introducedHeight != 0) {
			if (introducedHeight > maxHeight) {
				maxHeight = introducedHeight;
				
			} else if (introducedHeight < minHeight) {
				minHeight = introducedHeight;
			}
			
			// We ask for another height
			System.out.print("Type another height: ");
			introducedHeight = reader.nextInt();
		}
		
		// Last message to the user
		System.out.print("The minimum height is " + minHeight + " inches" + ", while the"
				+ " maximum height is " + maxHeight + " inches.");
		
		reader.close();
	}

}
