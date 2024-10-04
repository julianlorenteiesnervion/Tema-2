package boletinifelse;

import java.util.*;

public class Ejer1 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de la variable para el número solicitado
		int num;
		
		// Mensaje para solicitar al usuario el número
		System.out.print("Introduce un número: ");
		num = reader.nextInt();
		
		// If para comprobar si el número es par o impar
		if (num % 2 == 0) {
			System.out.print(num + " es un número par.");
		} else {
			System.out.print(num + " es un número impar.");
		}
		
		reader.close();

	}

}
