package boletincondicionales;

import java.util.*;

public class Ejer2 {

	public static void main(String[] args) {
		// Creación Scanner
		Scanner reader = new Scanner(System.in);
		
		/* Declaración de la variable para el número
		 * introducido por el usuario y para el valor absoluto */
		int num;
		int valorAbsoluto;
		
		// Solicitar al usuario el número
		System.out.print("Introduce un número: ");
        num = reader.nextInt();

        // Calcular el valor absoluto usando el operador ternario
        valorAbsoluto = (num < 0) ? -num : num;

        // Mostrar el resultado
        System.out.println("El valor absoluto de " + num + " es " + valorAbsoluto);

        reader.close();

	}

}
