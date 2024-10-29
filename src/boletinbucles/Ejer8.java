package boletinbucles;

import java.util.*;

public class Ejer8 {

	public static void main(String[] args) {
		/* En este programa hago uso de un while con un if y un else if
		 * para mostrarle al usuario cierta información sobre los números
		 * que ha introducido. En la variable lastNum guardamos el último número que
		 * el usuario escribió, y en la variable num guardamos el nuevo número que
		 * ha introducido, de forma que podemos realizar ciertas operaciones con un if
		 * dependiendo de si el nuevo número es mayor o menor que el último número introducido.
		 * En este caso, si el nuevo número introducido es menor que el último número,
		 * se imprime que es un fallo y sumamos una unidad al contador. Luego,
		 * pase lo que pase, se añadirá una unidad al contador de números introducidos,
		 * y si se introduce 0, el bucle terminará, imprimiendo luego la cantidad de números
		 * introducidos y la cantidad de números fallados */
		
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);

		// Variable lastNum para guardar el último número introducido por el usuario
		int lastNum = 0;
		
		// Variable num para guardar el nuevo número introducido por el usuario
		int num;
		
		// Variable numCounter para guardar la cantidad de números introducidos
		int numCounter = 0;
		
		// Variable fails para guardar la cantidad de fallos
		int fails = 0;
		
		// Le solicitamos al usuario un número
		System.out.print("Dime un número inicial: ");
		num = reader.nextInt();
		
		// Mientras el número introducido no sea 0...
		while (num != 0) {
			numCounter++; // Añadimos un uno al contador de números introducidos
			
			/* En el caso de que sea menor que el último número, imprimimos por pantalla el fallo
			 * y le sumamos una unidad al contador de fallos */
			if (num < lastNum) {
				System.out.println("Fallo es menor.");
				fails++;
			}
			
			/* Actualizamos la variable lastNum para que el nuevo número sea
			el último número */
			lastNum = num;
			
			// Le volvemos a solicitar al usuario otro número
			System.out.print("Dime un número: ");
			num = reader.nextInt();
		}
		
		// Mensaje final al usuario
		System.out.print("Total de números introducidos: " + numCounter + "\n"
				+ "Números fallados: " + fails);
		
		reader.close();
	}

}
