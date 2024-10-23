package boletinfor;

import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos las variables
		// Variable num para guardar el número introducido
		int num;
		
		// Variable numMedia para guardar la media
		double media = 0;
		
		// For para preguntarle al usuario los 10 números
		/* Empezamos en 0, continuamos mientras i sea menor que 10 y sumamos un
		 * dígito más por cada vuelta */
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduce un número: ");
			num = reader.nextInt();
			
			// A media le sumamos el nuevo número introducido
			media += (double) num;
		}
		// Dividimos la suma total entre 10 para obtener la media
		media /= 10;
		
		System.out.println("La media es " + media);
		
		reader.close();
	}

}
