package boletindowhile;

import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de la variable num para imprimir el número
		int num = 1;
		
		/* Le preguntamos al usuario por el número que deberá introducir
		 * para imprimir todos los números desde el 1 (num) hasta el que
		 * el introducirá (numIntroducido) */
		System.out.print("Introduce un número: ");
		// Declaramos también la variable y escaneamos la entrada
		int numIntroducido = reader.nextInt();
		
		// Si el número es distinto de 5, realizar lo solicitado
		if (numIntroducido != 5) {
		do {
			System.out.println(num);
			num++;
		} while (num <= numIntroducido);
		} else { // En el caso de que sea 5, hacemos la suma de 1+2+3+4+5
			System.out.print("1 + 2 + 3 + 4 + 5: " + (1 + 2 + 3 + 4 + 5));
		}
	}

}
