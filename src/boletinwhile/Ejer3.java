package boletinwhile;

import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		/* Variable numIntroducido para recoger el número introducido
		 * por el usuario */
		int numIntroducido;
		
		// Variable numTotal para guardar la suma de los números introducidos
		int numTotal = 0;
		
		/* Variable contador para ir contando la cantidad de números
		 * que ha introducido el usuario para así luego hacer la media */
		int contador = 0;
		
		// Variable media para guardar la media de todos los números introducidos
		double media;
		
		// Le solicitamos al usuario un número
		System.out.print("Introduce un número: ");
		numIntroducido = reader.nextInt();
		
		/* Creamos un bucle en el que, mientras el número introducido
		 * sea positivo (mayor o igual que 0), se seguirá pidiendo
		 * números al usuario. En el caso contrario (número negativo),
		 * se hará la media de todos los números que fueron introducidos */
		while (numIntroducido >= 0) {
			/* Añadimos un número más al contador, que luego utilizaremos
			 * para calcular la media */
			contador++;
			
			// Sumamos el número introducido al resultado final
			numTotal += numIntroducido;
			
			System.out.print("Introduce otro número: ");
			numIntroducido = reader.nextInt();
		}
		
		/* Calculamos la media dividiendo la suma total de los números entre
		 *  la cantidad de números introducidos */
		media = (double) numTotal / contador;
		
		// Mostramos la media
		System.out.print("La media es " + media);
		
		reader.close();
	}

}
