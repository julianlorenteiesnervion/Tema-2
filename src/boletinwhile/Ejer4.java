package boletinwhile;

import java.util.*;

public class Ejer4 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		/* Variable numIntroducido para recoger el número introducido
		 * por el usuario */
		int numIntroducido;
		
		// Variable sumPos para guardar la suma de los números positivos
		int sumPos = 0;
		
		// Variable sumNeg para guardar la suma de los números negativos
		int sumNeg = 0;
		
		/* Variable contador para ir contando la cantidad de números
		 * que ha introducido el usuario y así pararlo en 10 */
		int contador = 0;
		
		// Variable mediaNeg para guardar la media de los números negativos
		double mediaNeg = 0;
		
		// ContadorNeg para la cantidad de números negativos introducidos
		int contadorNeg = 0;
		
		// ContadorCero para la cantidad de ceros introducidos
		int contadorCero = 0;
		
		/* While en el que le pediremos al usuario 10 números,
		 * ya que por cada vuelta de while se sumará un 1 al contador.
		 * En el momento en el que el contador sea 10, será desigual que 10
		 * y por lo tanto esa condición del while será false y terminará el bucle. */
		while (contador != 10) {
			// Añadimos un número más al contador
			contador++;
			
			System.out.print("Introduce un número: ");
			numIntroducido = reader.nextInt();
			
			// If para las operaciones
			/* Si el número introducido es mayor que 0, es positivo
			 * y por lo tanto se sumará junto a los otros números positivos */
			if (numIntroducido > 0) {
				sumPos += numIntroducido;
			/* Si el número es menor que 0, es negativo
			 * y por lo tanto se sumará junto a los otros números negativos,
			 * añadiendo también un 1 por vuelta al contador para luego poder
			 * calcular la media dividiendo entre ese número */
			} else if (numIntroducido < 0) {
				sumNeg += numIntroducido;
				contadorNeg++;
			/* Si el número no es ni positivo ni negativo, será 0
			 * y se sumará un 1 al contador de ceros */
			} else {
				contadorCero++;
			}
		}
		
		// If para comprobar que la división que se va a realizar no es entre 0
		if (contadorNeg != 0)
		mediaNeg = (double) sumNeg / contadorNeg;
		
		// Mensaje final al usuario con las operaciones solicitadas
		System.out.print("\nLa suma de los números positivos es " + sumPos + ","
				+ " la media de los números negativos es " + mediaNeg + " y la"
						+ " cantidad de ceros introducidos es " + contadorCero + ".");
		
		reader.close();
	}

}
