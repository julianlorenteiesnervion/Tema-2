package boletinifelse;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de las tres variables para los números
		int num1;
		int num2;
		int num3;
		
		// Declaración de las variables para los 3 números ordenados
		int numMayor;
		int numX;
		int numY;
		
		// Mensaje y reader para leer los números introducidos
		System.out.print("Introduce el primer número : ");
		num1 = reader.nextInt();
		
		System.out.print("Introduce el segundo número : ");
		num2 = reader.nextInt();
		
		System.out.print("Introduce el tercer número : ");
		num3 = reader.nextInt();
		
		// If para mostrar los tres números ordenados de mayor a menor
		if (num1 > num2 && num1 > num3) {
			numMayor = num1;
			numX = num2;
			numY = num3;
		} else if (num2 > num1 && num2 > num3) {
			numMayor = num2;
			numX = num1;
			numY = num3;
		} else if (num3 > num1 && num3 > num2) {
			numMayor = num3;
			numX = num1;
			numY = num2;
		}
		
		if (numX > numY) {
			System.out.print(numMayor + " > " + numX + " > " + numY);
		} else if (numY > numX) {
			System.out.print(numMayor + " > " + numY + " > " + numX);
		}
		
		System.out.println(numMayor);
		System.out.println(numX);
		System.out.println(numY);
		
		reader.close();
	}

}
