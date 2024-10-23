package boletinfor;

import java.util.*;

public class Ejer7 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		// Variable numIntroducido para guardar el número que le pediremos al usuario
		int numIntroducido;
		
		// Variable contador para guardar la cantidad de divisores del número introducido
		int contador = 0;
		
		// Le preguntamos al usuario por el número
		System.out.print("Introduce un número para saber si es primo o no: ");
		numIntroducido = reader.nextInt();
		
		/* For que iniciamos con i = 1 y que se aumentará en 1 cada vuelta; daremos vueltas hasta que
		 * i sea menor o igual que el número introducido */
		for (int i = 1; i <= numIntroducido; i++) {
			/* Si la división del número introducido entre el número i nos da un resto de 0,
			 * será divisible entre ese número y por lo tanto nos interesa guardar ese
			 * dato en el contador de divisores */
			if (numIntroducido % i == 0)
				contador++; // Incremento al contador
		}
		
		// Si la cantidad de divisores del número es 2, el número es primo (por sí mismo y por 1)
		if (contador == 2)
			System.out.print("El número " + numIntroducido + " es un número primo.");
		else // En caso contrario, pues no lo es
			System.out.print("El número " + numIntroducido + " no es un número primo.");
		
		reader.close();

	}

}
