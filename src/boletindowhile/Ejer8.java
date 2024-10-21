package boletindowhile;

import java.util.*;

public class Ejer8 {

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
		do { // Do-while para repetir la tirada si no ha sido válida
		System.out.print("Introduce el primer número obtenido: ");
		tirada1 = reader.next();
		} while (!(tirada1.equals("uno") || tirada1.equals("dos") || tirada1.equals("tres") || tirada1.equals("cuatro") || tirada1.equals("cinco") || tirada1.equals("seis")));
		
		do { // Do-while para repetir la tirada si no ha sido válida
		System.out.print("Introduce el segundo número obtenido: ");
		tirada2 = reader.next();
		} while (!(tirada2.equals("uno") || tirada2.equals("dos") || tirada2.equals("tres") || tirada2.equals("cuatro") || tirada2.equals("cinco") || tirada2.equals("seis")));
		
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
