package boletinswitch;

import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		/* Declaración de las variables para los dos números
		introducidos por el usuario y para la operación */
		int num1;
		int num2;
		int operacion;
		
		/* Mensajes por pantalla para guardar los números
		que el usuario introducirá */
		System.out.print("Introduce el primer número: ");
		num1 = reader.nextInt();
		
		System.out.print("Introduce el segundo número: ");
		num2 = reader.nextInt();
		
		// Pregunta al usuario qué operación quiere realizar
		System.out.print("\n¿Qué operación quieres realizar?\nSUMAR LOS NÚMEROS (1)\n"
				+ "RESTAR LOS NÚMEROS (2)\nMULTIPLICAR LOS NÚMEROS (3)\nDIVIDIR LOS NÚMEROS (4)"
				+ "\n\nIntroduce la operación a realizar: ");
		
		// Guardamos la operación que quiere realizar el usuario
		operacion = reader.nextInt();
		
		// Switch para realizar la operación solicitada por el usuario
		switch (operacion) {
		case 1:
			System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case 2:
			System.out.print(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case 3:
			System.out.print(num1 + " x " + num2 + " = " + (num1 * num2));
			break;
		case 4:
			System.out.print(num1 + " ÷ " + num2 + " = " + (num1 / num2));
			break;
		default:
			System.out.print("Parece ser que no has seleccionado una operación válida.");
		}
		
		reader.close();

	}

}
