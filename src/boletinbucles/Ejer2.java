package boletinbucles;

import java.util.*;

public class Ejer2 {

	public static void main(String[] args) {
		/* En este programa, le solicitamos al usuario un número del cual comprobaremos
		 * cuántos números primos hay entre el 1 y el número introducido. Para ello,
		 * he utilizado principalmente la función "for" con la que calculo todas las
		 * divisiones con resto 0 desde el 1 hasta el número a calcular (es decir,
		 * si el número a calcular es el 3, se hará 3/1, 3/2 y 3/3). Esta comprobación
		 * se hace con todos los números desde el 1 hasta el número introducido por el
		 * usuario, y en el caso de que un número sólo haya obtenido dos divisiones
		 * exactas (divisiones con resto 0), significará que es un número primo
		 * y lo añadiremos al contador de números primos. */
		
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Variable numIntroducido para recoger el número del usuario
		int numIntroducido;
		
		/* Variable contadorPrimos para guardar en un contador la cantidad
		de números primos encontrados */
		int contadorPrimos = 0;
		
		/* Le solicitamos al usuario el número para calcular todos los primos
		desde el 1 hasta ese número introducido */
		System.out.print("Introduce un número: ");
		numIntroducido = reader.nextInt();
		
		/* For en el que i será cada número a comprobar si es primo o no,
		 * es decir, si el usuario introduce el número 5, i tendrá que ser 1, 2, 3, 4 y 5
		 * a lo largo de este for para comprobar si esos 5 números son primos o no, así
		 * que daremos tantas vueltas como números haya introducido el usuario para así comprobar
		 * todos esos números */
		for (int i = 1; i <= numIntroducido; i++) {
			/* Inicializamos y declaramos el contador de divisores del número a comprobar,
			 * que se restablecerá a 0 por cada vuelta */
			int contadorDivisores = 0;
			
			/* For para comprobar si el número es primo. Para ello, uso la variable j que será el divisor.
			 * Por cada vuelta se comprueba si i es divisible entre j. Si lo es, sumaremos un uno al
			 * contador de divisores, y luego dará otra vuelta para comprobar la división de i entre
			 * el siguiente número */
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					contadorDivisores++;
			}
			
			/* Después de calcular los divisores que tiene el número i en esta vuelta,
			 * en el caso de que sólo tenga 2 divisores, el número será primo y por lo tanto
			 * guardaremos ese dato en una variable llamada "contadorPrimos" en la que, como su
			 * propio nombre indica, guardaremos la cantidad de números primos descubiertos */
			if (contadorDivisores == 2)
				contadorPrimos++;
		}
		
		System.out.print("Se han descubierto " + contadorPrimos + " números primos entre el 1 y"
				+ " el " + numIntroducido + ".");

	}

}
