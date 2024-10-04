package boletinifelse;

import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de la variable double para el número
		double num;
		
		// Mensaje por pantalla para solicitar el número
		System.out.print("Introduce un número: ");
		num = reader.nextDouble();
		
		/* If para comprobar si el número introducido es
		un número casi-cero */
		if (num > -1 && num < 1 && num != 0) {
			System.out.print("El número " + num + " es un número casi-cero.");
		} else {
			System.out.print("El número " + num + " no es un número casi-cero.");
		}
		
		reader.close();

	}

}
