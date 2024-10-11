package boletincondicionales;

import java.util.*;

public class Ejer1 {

	public static void main(String[] args) {
		/* En este programa, gracias a poder obtener el cociente y el resto
		 * de las divisiones, podemos saber si el número introducido por el
		 * usuario es capicúa o no. Para ello, simplemente hacemos comparaciones
		 * entre ciertas cifras del número introducido. */
		
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de las variables
		int num;
		int millar;
		int centena;
		int decena;
		int unidad;
		
		// Le preguntamos al usuario por su número
		System.out.print("Introduce un número entre 0 y 9999: ");
		num = reader.nextInt();
		
		// Operaciones para saber si el número introducido es capicúa
		// Comprobación para saber si el usuario ha introducido un número correcto
		if (num < 0 || num > 9999) {
			System.out.print("No has introducido un número entre 0 y 9999.");
		} else if (num < 10) { // Los números del 0 al 9 no son capicúa
			System.out.print(num + " no es un número capicúa.");
			
		} else if (num >= 10 && num <= 99) { // Para números de 2 cifras, obtenemos ambas y si son iguales, es capicúa
			decena = num / 10;
			unidad = num % 10;
			
			if (decena == unidad) {
				System.out.print(num + " es un número capicúa.");
			} else {
				System.out.print(num + " no es un número capicúa.");
			}
			
		// En el caso de 3 cifras, sólo nos interesan los dos extremos (la centena y la unidad)
		} else if (num >= 100 && num <= 999) {
			centena = num / 100;
			unidad = num % 10;
			
			if (centena == unidad) {
				System.out.print(num + " es un número capicúa.");
			} else {
				System.out.print(num + " no es un número capicúa.");
			}
			
		/* Y por último, en el caso de 4 cifras, debemos comparar los dos extremos (el millar y la unidad)
		 * y luego la los dos intermedios (la centena y la decena). En caso de que los dos cumplan la
		 * condición de ser igual al otro, el número será capicúa */
		} else {
			millar = num / 1000;
			centena = (num / 100) % 10;
			decena = (num / 10) % 10;
			unidad = num % 10;
			
			if (millar == unidad && centena == decena) {
				System.out.print(num + " es un número capicúa.");
			} else {
				System.out.print(num + " no es un número capicúa.");
			}
		}
		
		reader.close();

	}

}
