package boletincondicionales;

import java.util.*;

public class Ejer2 {

	public static void main(String[] args) {
		/* En este código, para obtener el valor absoluto,
		 * le pedimos al usuario una entrada de número entero.
		 * Luego, en caso de que el número sea negativo, lo
		 * invertimos a positivo, o, en caso de que sea positivo,
		 * simplemente se deja tal cual el usuario nos lo indicó. */
		
		// Creación Scanner
		Scanner reader = new Scanner(System.in);
		
		/* Declaración de la variable para el número
		 * introducido por el usuario y para el valor absoluto */
		int num;
		int valorAbsoluto;
		
		// Solicitar al usuario el número
		System.out.print("Introduce un número: ");
        num = reader.nextInt();

        // Calcular el valor absoluto usando el operador ternario
        valorAbsoluto = (num < 0) ? -num : num;

        // Mostrar el resultado
        System.out.println("El valor absoluto de " + num + " es " + valorAbsoluto);

        reader.close();

	}

}
