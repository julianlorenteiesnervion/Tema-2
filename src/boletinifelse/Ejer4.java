package boletinifelse;

import java.util.*;

public class Ejer4 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de las dos variables para los dos números introducidos
		int num1;
		int num2;
		
		// Mensaje y reader para leer los dos números introducidos por el usuario
		System.out.print("Introduce el primer número : ");
		num1 = reader.nextInt();
		
		System.out.print("Introduce el segundo número : ");
		num2 = reader.nextInt();
		
		// If para mostrar los dos números ordenados de menor a mayor
		if (num1 > num2) {
			System.out.print(num2 + " < " + num1);
		} else if (num1 < num2) {
			System.out.print(num1 + " < " + num2);
		} else if (num1 == num2) {
			System.out.print(num1 + " = " + num2);
		}
		
		reader.close();
	}

}
