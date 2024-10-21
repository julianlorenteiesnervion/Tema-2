package boletindowhile;

import java.util.*;

public class Ejer4 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		/* Declaración de las variables num para el número
		introducido por el usuario y num2 para usarlo como contador */
		int num;
		int num2 = 1;
		
		// Le solicitamos al usuario un número
		System.out.print("Introduce un número: ");
		num = reader.nextInt();
		
		/* Do-while para mostrar la tabla de multiplicar del número
		 * introducido */
		do {
			System.out.println(num + " x " + num2 + " = " + (num * num2));
			num2++;
		} while (num2 <= 10);
		
		reader.close();
	}

}
