package boletinwhile;

import java.util.*;

public class Ejer1 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		/* Variable numIntroducido para recoger el número introducido
		 * por el usuario */
		int numIntroducido;
		
		// Variable numFinal para ir sumando los números en esa variable
		int numFinal = 0;
		
		// Le solicitamos al usuario un número
		System.out.print("Introduce un número: ");
		numIntroducido = reader.nextInt();
		
		/* Creamos un bucle en el que, mientras el número introducido
		 * sea positivo (mayor o igual que 0), se seguirá pidiendo
		 * números al usuario. En el caso contrario (número negativo), el
		 * programa mostrará por pantalla la suma de todos esos números
		 * positivos introducidos */
		while (numIntroducido >= 0) {
			numFinal += numIntroducido;
			
			System.out.print("Introduce otro número: ");
			numIntroducido = reader.nextInt();
		}
		
		// Mostramos el número final con todos los números positivos sumados
		System.out.print(numFinal);
		
		reader.close();
	}

}
