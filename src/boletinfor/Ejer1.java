package boletinfor;

import java.util.*;

public class Ejer1 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de la variable num para pedirle el número al usuario
		int num;
		
		// Pedimos el número al usuario
		System.out.print("Introduce un número: ");
		num = reader.nextInt();
		
		/* For
		 * Desde el 1
		 * Mientras sea menor que el número introducido
		 * Se añade un número más */
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
		reader.close();
	}

}
