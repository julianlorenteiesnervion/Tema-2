package boletinfor;

import java.util.*;

public class Ejer2 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de las variables
		// Variable para guardar el número que nos introduce el usuario
		int num;
		
		// Preguntamos al usuario por el número
		System.out.print("Introduce un número: ");
		num = reader.nextInt();
		
		// For
		/* Iniciamos en 0, seguiremos repitiendo el bucle mientras i sea menor o igual que
		 * el número introducido y sumaremos 3 por cada vuelta a i */
		for (int i = 0; i <= num; i+=3) {
			System.out.println(i);
		}
		reader.close();
	}

}
