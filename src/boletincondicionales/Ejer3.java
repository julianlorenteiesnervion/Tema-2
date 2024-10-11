package boletincondicionales;

import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		/* En este programa, le solicitamos al usuario su DNI sin letra
		 * para luego calcular mediante el módulo 23 del DNI su letra
		 * (usando un switch con un caso para cada módulo que mostrará la letra) */
		
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de la variable int para el DNI introducido y char para la letra
		int dni;
		char letraDni = 'X';
		
		// Pregunta al usuario por su DNI, con un if para comprobar si tiene 8 cifras
		System.out.print("Introduce tu DNI (sin letra): ");
		dni = reader.nextInt();
		
		if (dni >= 10000000 && dni <= 99999999) {
			// Switch para calcular la letra
			switch (dni%23) {
			case 0 -> {
				letraDni = 'T';
			}
			case 1 -> {
				letraDni = 'R';
			}
			case 2 -> {
				letraDni = 'W';
			}
			case 3 -> {
				letraDni = 'A';
			}
			case 4 -> {
				letraDni = 'G';
			}
			case 5 -> {
				letraDni = 'M';
			}
			case 6 -> {
				letraDni = 'Y';
			}
			case 7 -> {
				letraDni = 'F';
			}
			case 8 -> {
				letraDni = 'P';
			}
			case 9 -> {
				letraDni = 'D';
			}
			case 10 -> {
				letraDni = 'X';
			}
			case 11 -> {
				letraDni = 'B';
			}
			case 12 -> {
				letraDni = 'N';
			}
			case 13 -> {
				letraDni = 'J';
			}
			case 14 -> {
				letraDni = 'Z';
			}
			case 15 -> {
				letraDni = 'S';
			}
			case 16 -> {
				letraDni = 'Q';
			}
			case 17 -> {
				letraDni = 'V';
			}
			case 18 -> {
				letraDni = 'H';
			}
			case 19 -> {
				letraDni = 'L';
			}
			case 20 -> {
				letraDni = 'C';
			}
			case 21 -> {
				letraDni = 'K';
			}
			case 22 -> {
				letraDni = 'E';
			}
			}
			
			System.out.print("Tu DNI es " + dni + letraDni);
		} else {
			System.out.print("No has introducido un DNI de 8 cifras.");
		}
		
		reader.close();

	}

}
