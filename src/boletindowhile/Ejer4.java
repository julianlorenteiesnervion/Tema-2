package boletindowhile;

import java.util.*;

public class Ejer4 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num = reader.nextInt();
		
		int num2 = 1;
		
		do {
			System.out.println(num + " x " + num2 + " = " + (num * num2));
			num2++;
		} while (num2 <= 10);

	}

}
