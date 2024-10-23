package boletinfor;

import java.util.*;

public class Ejer8 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos la variable para el número A
		int numA;
		
		// Declaramos la variable para el número B
		int numB;
		
		// Preguntamos por ambos números (A y B)
		System.out.print("Introduce el número A: ");
		numA = reader.nextInt();
		
		System.out.print("Introduce el número B: ");
		numB = reader.nextInt();
		
		if (numA == numB) { // Si A es igual a B, simplemente imprimimos A (o B, da exactamente igual)
			System.out.print(numA);
		} else if (numA < numB) { // Si A es menor que B
			for (int i = numA; i <= numB; i++) { // Aumentamos i y lo imprimimos hasta que sea menor o igual que B
				System.out.println(i);
			}
		} else { // Si no es ninguna de las otras dos condiciones anteriores, significa que B es menor que A
			for (int i = numB; i <= numA; i++) { // Aumentamos i y lo imprimimos hasta que sea menor o igual que A
				System.out.println(i);
			}
		}
		
		reader.close();

	}

}
