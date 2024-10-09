package boletinswitch;

import java.util.*;

public class Ejer1 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de la variable para la nota introducida por el usuario
		int nota;
		
		// Preguntamos al usuario el número
		System.out.print("Introduce tu nota: ");
		nota = reader.nextInt();
		
		// Creación del switch para mostrar la calificación de la nota introducida
		switch (nota) {
		case 0, 1, 2, 3, 4 -> {
			System.out.print("Insuficiente");
		}
		
		case 5 -> {
			System.out.print("Suficiente");
		}
		
		case 6 -> {
			System.out.print("Bien");
		}
		
		case 7, 8 -> {
			System.out.print("Notable");
		}
		
		case 9, 10 -> {
			System.out.print("Sobresaliente");
		}
		
		default -> {
			System.out.println("No has introducido una nota entre 0 y 10.");
		}
		
		}
		
		reader.close();

	}

}
