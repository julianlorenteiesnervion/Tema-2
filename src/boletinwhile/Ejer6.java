package boletinwhile;

import java.util.*;

public class Ejer6 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		/* Variable altitudIntroducida en la que guardaremos
		 * la última altitud introducida */
		int altitudIntroducida = 0;
		
		/* Variable arbolMasAlto para guardar la altitud
		 * del árbol más alto introducido */
		int arbolMasAlto = 0;
		
		// Preguntamos al usuario por una altura
		System.out.print("Introduce una altura (en cm): ");
		altitudIntroducida = reader.nextInt();
		
		/* While en el que si la altitud introducida es desigual a
		 * -1, seguiremos preguntando más altitudes al usuario */
		while (altitudIntroducida != -1) {
			/* En el caso en el que la altitud introducida sea
			 * más grande que el último árbol guardado más alto,
			 * actualizaremos la altitud del árbol más alto con el último
			 * valor introducido */
			if (altitudIntroducida > arbolMasAlto)
				arbolMasAlto = altitudIntroducida;
			
			// Le preguntamos por otra altura
			System.out.print("Introduce otra altura: ");
			altitudIntroducida = reader.nextInt();
		}
		
		// Mensaje final para decirle al usuario la altura del árbol más alto registrado
		System.out.print("El árbol más alto mide " + arbolMasAlto + " cm.");
		
		reader.close();

	}

}