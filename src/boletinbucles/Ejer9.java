package boletinbucles;

import java.util.*;

public class Ejer9 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		int num;
		
		int cifras = 0;
		
		do {
			System.out.print("Introduce un número mayor que 0: ");
			num = reader.nextInt();
		} while (num <= 0);
		
		/*
		for (; num / 10 > 0; cifras++) {
			num /= 10;
		}
		 */
		
		while (num / 10 > 0) {
			cifras++;
			num /= 10;
		}
		
		cifras++;
		
		do {
			cifras++;
			num /= 10;
		} while (num / 10 > 0);
		
		System.out.print("El número " + num + " tiene " + cifras + " cifras.");
		
		reader.close();

	}

}
