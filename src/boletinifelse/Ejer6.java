package boletinifelse;

import java.util.*;

public class Ejer6 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		int a;
		int b;
		int c;
	
		// Declaración de variables double para las dos x's y el discriminante
		double x1;
		double x2;
		double discriminante;
		
		// Mensajes iniciales para solicitar los valores de a, b y c
		System.out.print("Introduce el valor de a: ");
		a = reader.nextInt();
		
		System.out.print("Introduce el valor de b: ");
		b = reader.nextInt();
		
		System.out.print("Introduce el valor de c: ");
		c = reader.nextInt();
		
		// Operaciones para realizar la ecuación de segundo grado
		// Para ecuaciones de primer grado
		if (a == 0) {
			x1 = (double) -c / b;
			System.out.println("La ecuación sólo tiene una solución: " + x1);
		} else {
			// Segundo grado
			discriminante = b*b -4 * a * c;
			if (discriminante < 0) {
				System.out.println("La ecuación no tiene una solución");
			} else {
				x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
				x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
		
		reader.close();
	}

}
