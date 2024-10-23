package boletinfor;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos la variable en la que guardaremos el número solicitado
		int numIntroducido = 0;
		
		// Variable para guardar las multiplicaciones e ir sustituyendo los valores
		int multiplicacion;
		
		// Variable para guardar el factorial
		int factorial = 0;
		
		// Le pedimos el número al usuario
		System.out.print("Introduce un número para mostrarte su factorial: ");
		numIntroducido = reader.nextInt();
		
		// Guardamos el número introducido en la variable multiplicación
		multiplicacion = numIntroducido;
		
		/* For en el que i valdrá el número introducido menos uno, por ejemplo,
		 * en caso de introducir 5, multiplicación valdrá 5 e i valdrá 4, entonces
		 * se hará 5 x 4 */
		for (int i = numIntroducido - 1; i > 0; i--) {
			// Actualizamos multiplicación para que valga el valor de la multiplicación realizada
			multiplicacion *= i;
		}
		
		// Guardamos esa multiplicación en la variable "factorial"
		factorial = multiplicacion;
		
		// Mensaje final
		System.out.println("El factorial de " + numIntroducido + " es " + factorial + ".");
		
		reader.close();
	}

}
