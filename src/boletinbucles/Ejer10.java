package boletinbucles;

import java.util.*;

public class Ejer10 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		/* Declaración de la variable num que usaré para guardar y modificar
		 * el número introducido por el usuario según las operaciones */
		int num;
		
		/* Variable digit en la que guardaré temporalmente el último dígito
		 * del número introducido por el usuario, de forma que, por ejemplo,
		 * si el usuario introduce el número 121, almacenaremos el 1 para añadirlo
		 * a la variable numReversed, luego el 2 y por último el 1 */
		int digit;
		
		/* Variable numReversed en la que almacenaremos el número al revés.
		 * Para ello, iremos sumando uno a uno cada dígito gracias a la variable
		 * digit. Añadiremos un dígito por cada vuelta mediante una sencilla operación
		 * en la que multiplicaremos por 10 el número al revés actual para así sumarle
		 * el nuevo digito, de forma que si tenemos el número 1 en la variable numReversed,
		 * lo convertiremos en 10 y le sumaremos 2 para así poder añadirle el próximo 2,
		 * quedándonos con el número 12 */
		int numReversed = 0;
		
		/* Variable originalNum para guardar el número original introducido por el usuario,
		 * ya que luego nos servirá para comparar si el número al revés es igual que el
		 * número original introducido por el usuario */
		int originalNum;
		
		// Do while en el que el usuario debe introducir sí o sí un número mayor o igual a 0
		do {
		System.out.print("Introduce un número: ");
		num = reader.nextInt();
		originalNum = num;
		} while (num < 0);
		
		/* While para averiguar si el número es capicúa.
		 * Este while seguirá ejecutándose mientras el cociente de la división del número
		 * entre 10 es mayor que 0, de forma que cuando de menos de 0, significará que ya no
		 * hay más cifras */
		while (num > 0) {
			/* Guardamos en la variable digit el último dígito del número.
			 * Lo guardamos obteniendo el resto de la división del número entre 10 */
			digit = num % 10;
			
			/* Guardamos en la variable numReversed el nuevo dígito de la forma que expliqué
			 * anteriormente (multiplicamos ese número por 10 y le sumamos el nuevo dígito)
			 * Ejemplo:
			 * A 1 le queremos añadir el 2
			 * 1 * 10 = 10
			 * 10 + 2 = 12
			 * Así podemos concatenar esos dos números */
			numReversed = numReversed * 10 + digit;
			
			// Dividimos el número entre 10 para pasar a la siguiente cifra
			num /= 10;
		}
		
		// Si el número original es igual al número inverso, es capicúa
		if (originalNum == numReversed)
			System.out.print("El número " + originalNum + " es capicúa.");
		// Si no son iguales, no es capicúa
		else
			System.out.print("El número " + originalNum + " no es capicúa.");
		
		
		reader.close();

	}

}
