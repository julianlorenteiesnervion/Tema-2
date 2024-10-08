package boletinifelse;

import java.util.*;

public class Ejer10 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de las variables para los números
		int num1;
		int num2;
		int num3;
		
		// Preguntar al usuario los números
		System.out.print("Introduce el primer número: ");
		num1 = reader.nextInt();
		
		System.out.print("Introduce el segundo número: ");
		num2 = reader.nextInt();
		
		System.out.print("Introduce el tercer número: ");
		num3 = reader.nextInt();
		
		// Operaciones para saber si la suma de dos números es igual al otro número que sobra
		if (num1 + num2 == num3) {
            System.out.println(num1 + " + " + num2 + " = " + num3);
        } else if (num1 + num3 == num2) {
            System.out.println(num1 + " + " + num3 + " = " + num2);
        } else if (num2 + num3 == num1) {
            System.out.println(num2 + " + " + num3 + " = " + num1);
        } else {
            System.out.println("Ninguna suma de dos números es igual al otro.");
        }
		
		reader.close();

	}

}
