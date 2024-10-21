package boletindowhile;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Creación del Random
		Random random = new Random();
		
		// Declaración de variables
		// Variable num para guardar el número random del PC
		int num;
		// Variable numIntroducido para guardar el número que nosotros escribimos
		int numIntroducido = 0;
		// numMin para guardar el número más pequeño aproximado
		int numMin = 1;
		// numMax para guardar el número más grande aproximado
		int numMax = 101;
		
		// Mensaje de bienvenida
		System.out.print("Piensa en un número.\n"
				+ "El ordenador intentará acertarlo y usarás la tecla 1"
				+ " si el número es menor\no la tecla 2 si el número"
				+ "es mayor. En caso de que el ordenador acierte,"
				+ "\nusarás la tecla 3.\n");
		
		/* Do-while para que el PC intente acertar el número pensado por el usuario
		 * mientras el número sea distinto al que el usuario ha pensado */
		do {
			// El PC genera un número random
			num = random.nextInt(numMin, numMax);
			
			// Le pregunta al usuario si el número es correcto
			System.out.print("\nPC: ¿Es el " + num + "?");
			System.out.println("\n¿Es más pequeño (1), más grande (2) o es ese (3)?");
			
			// El usuario le indica si el número es menor, mayor o es ese
			numIntroducido = reader.nextInt();
			
			// Switch para actualizar el rango de generación aleatoria del PC
			switch (numIntroducido) {
			case 1 -> numMax = num; // Se actualiza el número mayor al número que dijo el PC
			case 2 -> numMin = num; // Se actualiza el número menor al número que dijo el PC
			case 3 -> { // Si se introduce 3, el PC habrá acertado el número
				System.out.print("\nPC: ¡He acertado el número!");
			} // Si no se ha introducido un número correcto, le lanzaremos un aviso al usuario
			default -> System.out.println("No has introducido un número correcto.");
			}
		} while (numIntroducido != 3);
		
		reader.close();
	}

}
