package boletindowhile;

import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		/* Declaración de la variable num y num2 para guardar
		 * los dos valores de la suma y numIntroducido para guardar
		 * el valor introducido por el usuario */
		int num = 1;
		int num2 = 1;
		int numIntroducido;
		
		/* Le preguntamos al usuario por el número que deberá introducir
		 * para imprimir la suma de todos los números desde el 1 (num) hasta el que
		 * el introducirá (numIntroducido) */
		System.out.print("Introduce un número: ");
		numIntroducido = reader.nextInt();
		
		// Do-while para realizar las operaciones
		do {
			num2++;
			num = num + num2;
			
		} while (num2 < numIntroducido);
		
		System.out.println(num);
	}

}
