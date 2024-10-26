package boletinbucles;

import java.util.*;

public class Ejer4 {

	public static void main(String[] args) {
		/* Este programa es muy similar al anterior sólo que invirtiendo algunas
		 * operaciones. En este caso, en vez de calcular el máximo común divisor,
		 * calcularemos el mínimo común múltiplo. Para ello, empezaremos a dividir
		 * el múltiplo (que será el número más grande introducido) entre el número A
		 * y el número B. Si ambas divisiones son exactas, significa que hemos encontrado
		 * el mínimo común múltiplo, en cambio, si no lo son, incrementaremos en uno el múltiplo
		 * y volveremos a probar hasta que encontremos uno. */
		
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de la variable numA para guardar el número A introducido
		int numA;
		
		// Declaración de la variable numB para guardar el número B introducido
		int numB;
		
		/* Variable multiplo para ir actualizando y comprobando el multiplo
		y guardar en ella el multiplo una vez haya sido encontrado */
		int multiplo;
		
		// Booleana para terminar el bucle una vez se haya hallado el mínimo común múltiplo
		boolean calculado = false;
		
		// Le solicitamos al usuario que introduzca ambos números
		System.out.print("Introduce el número A: ");
		numA = reader.nextInt();
		
		System.out.print("Introduce el número B: ");
		numB = reader.nextInt();
		
		/* En este caso, como queremos encontrar el mínimo común múltiplo,
		 * tendremos que empezar por el número más grande para realizar las divisiones,
		 * así que multiplo será el número más grande introducido de los 2 */
		if (numA > numB)
			multiplo = numA;
		else if (numB > numA)
			multiplo = numB;
		else // Si son iguales, cogemos el A (no importa si cogemos el B, es lo mismo)
			multiplo = numA;
		
		// Si los números son desiguales, haremos las comprobaciones para calcular el MCM
		if (numA != numB) {
			// Bucle while que se repetirá hasta que el mínimo común múltiplo sea encontrado
			while (calculado == false) {
				/* Si al dividir el múltiplo entre el número A y entre el número B obtenemos
				 * como resto 0, tendremos una división exacta, lo que significará que el múltiplo
				 * que hemos comprobado es múltiplo de ambos números (A y B), y al ser el más pequeño,
				 * será el mínimo común múltiplo */
				if (multiplo % numA == 0 && multiplo % numB == 0) {
					calculado = true; // MCM encontrado
				/* Si no ha sido encontrado, le sumaremos 1 al múltiplo y
				 * volveremos a repetir el while para volver a comprobar si el
				 * siguiente número sí que es el MCM */
				} else {
					multiplo++;
				}
			}
		}
		
		// Una vez calculado, imprimimos por pantalla el mínimo común múltiplo
		System.out.print("El mínimo común múltiplo de " + numA + " y " + numB + " es " + multiplo + ".");
		
		reader.close();

	}

}
