package english;

import java.util.*;

public class Ejer4 {

	public static void main(String[] args) {
		// Creating the Scanner and Random generated number
		Scanner reader = new Scanner(System.in);
		Random random = new Random();
		
		// Variables for random number and introduced number
		int num = random.nextInt(1, 101);
		int introducedNum = 0;
		
		// First message to the user
		System.out.print("Guess the number: ");
		introducedNum = reader.nextInt();
		
		// While number isn't the same as -1, the game will keep running
		while (introducedNum != -1) {
			System.out.print(introducedNum > num ? "Wrong, the number is lower. Try again: " : "Wrong, the number is higher. Try again: ");
			introducedNum = reader.nextInt();
			
			// Number guessed
			if (introducedNum == num) {
			System.out.print("You've guessed the number! It was " + num);
		}
		}
		
		// Game over (the user typed -1)
		System.out.print("Game over. The number was " + num);
		
		reader.close();
		
		

	}

}
