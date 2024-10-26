package boletinbucles;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		/* En este programa, no pongo comentario inicial ya que considero
		 * que lo he conseguido explicar mucho mejor explicando lo que hace
		 * cada cosa justo al lado de ello. Es un programa muy sencillito que
		 * no requiere de tanta explicación. */
		
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de la variable num para recoger el número introducido por el usuario
		int num;
		
		// Le preguntamos al usuario por el número
		System.out.print("Introduce un número del 0 al 20: ");
		num = reader.nextInt();
		
		/* Mientras el número introducido no esté en el rango comprendido
		 * entre el 0 y el 20, le seguiremos preguntando hasta que introduzca
		 * un número válido */
		while (num < 0 || num > 20) {
			System.out.print("No has introducido un número entre 0 y 20."
					+ "\nIntroduce otro número: ");
			num = reader.nextInt();
		}
		
		/* For en el que iremos aumentando por cada vuelta el número de la variable i,
		 * que nos servirá para el for que tenemos dentro */
		for (int i = 1; i <= num; i++) {
			/* For en el que daremos tantas vueltas como el número que vale i. Es decir,
			 * si i vale 3, este bucle se repetirá 3 veces, imprimiendo así 3 veces el número
			 * 3, que es lo que queremos. Para ello, al principio j valdrá 1, e iremos incrementando
			 * j por cada vuelta hasta que j valga lo mismo que i, imprimiendo así el número i un
			 * número de i veces */
			for (int j = 1; j <= i; j++)
				System.out.print(i);
			
			System.out.print("\n"); // Salto de línea
		}
		
		reader.close();

	}

}
