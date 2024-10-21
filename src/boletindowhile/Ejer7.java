package boletindowhile;

import java.util.*;

public class Ejer7 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		int num1 = 0;
		int num2 = 0;
		String operacion;
		
		// Do-while en el que ejecutamos el programa hasta que la cadena introducida sea una "E"
		do {
			// Le mostramos a los usuarios las distintas operaciones
			System.out.print("A. SUMAR LOS NÚMEROS"
					+ "\nB. RESTAR LOS NÚMEROS"
					+ "\nC. MULTIPLICAR LOS NÚMEROS"
					+ "\nD. DIVIDIR LOS NÚMEROS"
					+ "\nE. SALIR");
			
			// Recogemos el primer número
			System.out.print("\nIntroduce el primer número: ");
			num1 = reader.nextInt();
			
			// Recogemos el segundo número
			System.out.print("\nIntroduce el segundo número: ");
			num2 = reader.nextInt();
			
			// Le preguntamos qué operación quiere realizar
			System.out.print("\n¿Qué operación realizar?: ");
			operacion = reader.next();
			
			// Switch con las distintas operaciones que podemos realizar
			switch (operacion) {
			// Suma
			case "A" -> System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			// Resta
			case "B" -> System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			// Multiplicación
			case "C" -> System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
			// División
			case "D" -> System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			// Salir
			case "E" -> System.out.println("Saliendo del programa...");
			}
			
		} while (!(operacion.equals("E")));
		
		reader.close();
	}

}
