package boletinexamenesanteriores;

import java.util.*;

public class Ejer2 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		int numIntroducido;
		int num;
		int digit;
		int pares = 0;
		int impares = 0;
		
		do {
		System.out.print("Introduce un número mayor o igual que 0: ");
		numIntroducido = reader.nextInt();
		num = numIntroducido;
		} while (numIntroducido < 0);
		
		while (num > 0) {
			digit = num % 10;
			
			if (digit % 2 == 0)
				pares++;
			else
				impares++;
			
			num /= 10;
		}
		
		System.out.print("El número " + numIntroducido + " tiene " + pares + " cifras pares"
				+ " y " + impares + " cifras impares.");
		
		reader.close();
	}

}
