package boletincondicionales;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		/* En este programa, hago uso de la clase random para
		 * generar dos números aleatorios, y le pregunto al usuario
		 * que los sume para luego comprobar con un if si su operación
		 * fue correcta. */
		
		// Creamos el generador de números aleatorios y el scanner
		Random random = new Random();
		Scanner reader = new Scanner(System.in);
		
		/* Declaro las variables num1 y num2 para los dos números aleatorios,
		   y una variable numIntroducido para la respuesta del usuario */
		int num1 = random.nextInt(99) + 1;
		int num2 = random.nextInt(99) + 1;
		
		int numIntroducido;
		
		// Mensaje al usuario para que sume los números
		System.out.print("Suma los números " + num1 + " + " + num2);
		System.out.print("\nIntroduce la respuesta: ");
		numIntroducido = reader.nextInt();
		
		// Operaciones para comprobar si la suma es correcta
		if (num1 + num2 == numIntroducido) {
			System.out.print("Correcto. La suma de " + num1 + " + " + num2 + " es " + (numIntroducido));
		} else {
			System.out.print("Incorrecto. La suma de " + num1 + " + " + num2 + " es " + (num1 + num2));
		}
		
		reader.close();
		
		

	}

}
