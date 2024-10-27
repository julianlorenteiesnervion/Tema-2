package boletinbucles;

import java.util.*;

public class Ejer7 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Variable num para guardar el número introducido por el usuario
		int num;
		
		// Le solicitamos el número al usuario
		System.out.print("Introduce un número: ");
		num = reader.nextInt();
		
		/* For en el que c es un contador. Este bucle hará que por cada vuelta le incrementemos
		 * un 1 a c, y se repetirá mientras el contador sea menor o igual que el número introducido
		 * por el usuario */
		for (int c = 1; c <= num; c++) {
			/* Inicializamos la variable i a 1, este bucle se repetirá mientras i sea menor que c,
			 * incrementando un 1 por cada vuelta e imprimiendo i. Si i vale 1, imprimiremos 1,
			 * si vale 2, habremos imprimido 12, si vale 3, 123... */
			for (int i = 1; i < c; i++) {
				System.out.print(i);
			}
			
			/* Una vez ya tenemos los números ascendentes de la izquierda, imprimimos el número
			 * del contador, de forma que si el contador vale 3 en este momento,
			 * con el for anterior imprimimos 12 y con este el 3, quedando así 123 */
			System.out.print(c);
			
			/* Por último, nos queda imprimir los números en orden descendente. Para ello,
			 * he creado este for en el que he inicializado la variable j a un número menos que el contador.
			 * Es decir, si en esta vuelta del primer for el contador vale 3, empezaremos a imprimir
			 * desde el número 2 ya que el número 3 lo hemos imprimido anteriormente. Este bucle
			 * funcionará mientras j sea mayor que 0 y le restaremos un uno por cada vuelta, de forma
			 * que imprimimos 2, restamos, imprimimos 1, restamos y como 0 ya no es mayor que 0, el bucle
			 * termina */
			for (int j = c - 1; j > 0; j--) {
				System.out.print(j);
			}
			
			System.out.print("\n"); // Salto de línea
		}
		
		reader.close();

	}

}
