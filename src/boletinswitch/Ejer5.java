package boletinswitch;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		/* Declaración del string para recoger el
		tipo de permiso de conducir del usuario */
		String carnet;
		
		// Mensaje para solicitar el permiso
		System.out.print("Buenas, introduce la letra del"
				+ "tipo de tu carnet de conducir: ");
		carnet = reader.next();
		
		/* Switch para realizar la operación de imprimir el tipo
		de vehículos al que corresponde el permiso */
		switch (carnet) {
		case "A" -> {
			System.out.print("Motocicletas");
		}
		case "B1", "B2" -> {
			System.out.print("Automóviles");
		}
		case "C1", "C2", "C3", "C4", "C5" -> {
			System.out.print("Camiones");
		}
		case "D" -> {
			System.out.print("Autobuses");
		}
		case "E" -> {
			System.out.print("Remolques");
		}
		default -> {
			System.out.print("Categoría no contemplada.");
		}
		}
		
		reader.close();

	}

}
