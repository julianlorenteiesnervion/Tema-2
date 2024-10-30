package boletinexamenesanteriores;

import java.util.*;

public class Ejer1 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Variable num para guardar el número introducido por el usuario
		int num;
		
		// Le solicitamos el número al usuario
		System.out.print("Introduce un número: ");
		num = reader.nextInt();
		
		/* *****
		 * 
		 * For en el que i valdrá lo mismo que el número introducido por el usuario.
		 * Este bucle se repetirá tantas veces como el número del usuario ya que a
		 * i le iremos restando un uno por cada vuelta. Este bucle se repetirá mientras
		 * i sea mayor que 0, y por cada vuelta imprimirá un asterisco */
		for (int i = num; i > 0; i--) {
			System.out.print("*");
		}
		
		// Salto de línea
		System.out.print("\n");
		
		/* Imprimir las líneas interiores
		 * *     *
		 * *     *
		 * *     *
		 * Con este for, k valdrá lo mismo que el número introducido por el usuario y
		 * el bucle se repetirá mientras k sea mayor que 2 (teniendo en cuenta que hay
		 * un decremento de un uno por cada vuelta) ya que las líneas interiores son
		 * el número de líneas menos dos (en la línea superior e inferior son
		 * todos asteriscos) */
		for (int k = num; k > 2; k--) {
			
			/* Imprimir los asteriscos laterales de cada línea
			 * *     *
			 * En este for, j valdrá 2 ya que sólo vamos a imprimir 2 asteriscos,
			 * el lateral izquierdo y el derecho. Este bucle se repetirá mientras
			 * j sea mayor que 0, y por cada vuelta restaremos un uno a j.
			 * En la primera vuelta, se imprimirá el asterisco izquierdo,
			 * luego, con el siguiente for se imprimirán los espacios y una vez
			 * acabe ese for, este dará otra vuelta para imprimir el asterisco derecho */
			for (int j = 2; j > 0; j--) {
				System.out.print("*");
				
				/* Imprimir los espacios del interior de cada línea
				 * *     *
				 * En este for, i valdrá lo mismo que el número introducido por el usuario,
				 * por cada vuelta le restaremos un uno a i y se repetirá mientras que
				 * el i sea mayor que 2, ya que tenemos que excepcionar los dos asteriscos
				 * de los laterales */
				for (int i = num; i > 2; i--) {
					System.out.print(" ");
				}
			}
			// Salto de línea
			System.out.print("\n");
		}
		
		// Mismo for que el del principio para imprimir la línea inferior de asteriscos
		for (int i = num; i > 0; i--) {
			System.out.print("*");
		}
		
		reader.close();

	}

}
