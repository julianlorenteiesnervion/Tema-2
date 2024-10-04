package boletinifelse;

import java.util.*;

public class Ejer2 {

	public static void main(String[] args) {
		// Creación Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de las dos variables para los dos números enteros
		int num1;
		int num2;
		
		// Mensaje para solicitar ambos números al usuario
		System.out.print("Introduce el primer número: ");
		num1 = reader.nextInt();
		
		System.out.print("Introduce el segundo número: ");
		num2 = reader.nextInt();
		
		// If para comprobar e imprimir por pantalla si los números son iguales o no
		if (num1 == num2) {
			System.out.print("Los números " + num1 + " y " + num2 + " son iguales.");
		} else {
			System.out.print("Los números " + num1 + " y " + num2 + " no son iguales.");
		}
		
		reader.close();

	}

}
