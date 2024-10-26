package boletinbucles;

import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		/* En este programa, hago uso de un bucle while para ir probando por cada vuelta
		 * si un divisor hace que la división del número A entre ese divisor y número B
		 * también entre ese divisor dan como resultado una división exacta sin resto. En
		 * el caso de que sí den una división exacta ambos números, tendremos el máximo
		 * común divisor. Si no, le restaremos un 1 a ese divisor y volveremos a probar. */
		
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de la variable numA para guardar el número A introducido
		int numA;
		
		// Declaración de la variable numB para guardar el número B introducido
		int numB;
		
		/* Variable divisor para guardar el máximo común divisor una vez lo hayamos
		 * conseguido. También usaremos esta variable para ir probando de uno en uno
		 * si es el máximo común divisor o no */
		int divisor;
		
		// Booleana para terminar el bucle una vez se haya hallado el máximo común divisor
		boolean calculado = false;
		
		// Le solicitamos al usuario que introduzca ambos números
		System.out.print("Introduce el número A: ");
		numA = reader.nextInt();
		
		System.out.print("Introduce el número B: ");
		numB = reader.nextInt();
		
		/* Como el máximo común divisor nunca será más grande que el número
		 * más pequeño introducido, he creado este if para hacer que el divisor
		 * más grande no sea más grande que el número más pequeño recogido */
		// Si el numB es más pequeño que el número A, el divisor más grande a probar empezará por el numB
		if (numA > numB)
			divisor = numB;
		// Si el numA es más pequeño que el número B, el divisor más grande a probar empezará por el numA
		else if (numB > numA)
			divisor = numA;
		// En el caso en el que ambos números sean iguales, el máximo común divisor será el numA (o el numB, da igual)
		else
			divisor = numA;
		
		/* Si los números introducidos son distintos, haremos las operaciones para
		 * encontrar el máximo común divisor ya que, en el caso de que sean iguales,
		 * ya sabremos que el máximo común divisor es el mismo que esos dos números introducidos */ 
		if (numA != numB) {
			// Bucle while que se repetirá hasta que el máximo común divisor sea encontrado
			while (calculado == false) {
				/* Si ambos números divididos por X divisor dan como resto 0,
				 * significará que hemos encontrado el máximo común divisor */
				if (numA % divisor == 0 && numB % divisor == 0) {
					calculado = true; // MCD encontrado
				/* Si no ha sido encontrado, le restaremos 1 al divisor y
				 * volveremos a repetir el while para volver a comprobar si el
				 * siguiente número sí que es el MCD */
				} else {
					divisor--;
				}
			}
		}
		
		// Una vez calculado, imprimimos por pantalla el máximo común divisor
		System.out.print("El máximo común divisor de " + numA + " y " + numB + " es " + divisor + ".");
		
		reader.close();

	}

}
