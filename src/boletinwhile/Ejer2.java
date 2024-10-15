package boletinwhile;

import java.util.*;

public class Ejer2 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		/* Variable numIntroducido para recoger el número introducido
		 * por el usuario */
		int numIntroducido;
		
		/* Variable contador para ir contando la cantidad de números
		 * que ha introducido el usuario */
		int contador = 0;
		
		// Le solicitamos al usuario un número
		System.out.print("Introduce un número: ");
		numIntroducido = reader.nextInt();
		
		/* Creamos un bucle en el que, mientras el número introducido
		 * sea positivo (mayor o igual que 0), se seguirá pidiendo
		 * números al usuario. En el caso contrario (número negativo), el
		 * programa mostrará por pantalla la cantidad de números introducidos */
		while (numIntroducido >= 0) {
			// Añadimos un número más al contador
			contador++;
			
			System.out.print("Introduce otro número: ");
			numIntroducido = reader.nextInt();
		}
		
		// Mostramos el número final con la cantidad de números introducidos
		System.out.print(contador == 1 ? contador + " número positivo introducido." : contador + " números positivos introducidos.");
		
		reader.close();
	}

}
