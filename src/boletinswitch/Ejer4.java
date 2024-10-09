package boletinswitch;

import java.util.*;

public class Ejer4 {

	public static void main(String[] args) {
		// Creación Scanner
		Scanner reader = new Scanner(System.in);
		
		/* Declaración de las variables para los números en formato cadena
		 * introducidos por el usuario y variables enteras para guardar los números */
		String tirada1;
		String tirada2;
		int num1 = 0;
		int num2 = 0;
		
		// Solicitamos al usuario el número que sacó en las dos tiradas
		System.out.print("Buenas, introduce el número obtenido en la primera tirada,"
				+ "\nde forma que deberá ser introducido mediante letras y sin tildes (UNO, DOS, TRES...): ");
		tirada1 = reader.next();
		
		System.out.print("Introduce el segundo número obtenido: ");
		tirada2 = reader.next();
		
		// Creación de los dos switches para convertir el número de cadena a entero
		switch (tirada1.toLowerCase()) {
		case "uno" -> {
			num1 = 1;
		}
		case "dos" -> {
			num1 = 2;
		}
		case "tres" -> {
			num1 = 3;
		}
		case "cuatro" -> {
			num1 = 4;
		}
		case "cinco" -> {
			num1 = 5;
		}
		case "seis" -> {
			num1 = 6;
		}
		}
		
		switch (tirada2.toLowerCase()) {
		case "uno" -> {
			num2 = 1;
		}
		case "dos" -> {
			num2 = 2;
		}
		case "tres" -> {
			num2 = 3;
		}
		case "cuatro" -> {
			num2 = 4;
		}
		case "cinco" -> {
			num2 = 5;
		}
		case "seis" -> {
			num2 = 6;
		}
		}
		
		/* Switch final para comprobar que los números introducidos
		 * son correctos o alertar en caso de que no se haya introducido
		 * un dato válido */
		switch (num1) {
		case 1, 2, 3, 4, 5, 6 -> {
			switch (num2) {
			case 1, 2, 3, 4, 5, 6 -> {
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			}
			default -> {
				System.out.println("No has introducido un número comprendido entre 1 y 6.");
			}
			}
		}
		default -> {
			System.out.println("No has introducido un número comprendido entre 1 y 6.");
		}
		}
		
		reader.close();

	}

}
