package boletinifelse;

import java.util.*;

public class Ejer8 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de la variable para los números reales
		double nota;
		
		// Mensaje para solicitar la nota
		System.out.print("Introduce tu nota: ");
		nota = reader.nextDouble();
		
		// Operaciones para calcular el tipo de calificación según la nota
		if (nota >= 0 && nota < 5) {
            System.out.println("INSUFICIENTE");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("SUFICIENTE");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("BIEN");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("NOTABLE");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("SOBRESALIENTE");
        } else {
            System.out.println("Nota fuera de rango. Debe estar entre 0 y 10.");
        }
		
		reader.close();

	}

}
