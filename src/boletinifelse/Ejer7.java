package boletinifelse;

import java.util.*;

public class Ejer7 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de la variable para el número introducido por el usuario
		int num;
		
		// Solicitamos al usuario el número para que lo introduzca
		System.out.print("Introduce un número comprendido entre 0 y 99999: ");
		num = reader.nextInt();
		
		/* Operaciones para descubrir el número de cifras que tiene. Aunque se puede hacer de formás más eficientes
		*/
		if (num < 0 || num > 99999) {
            System.out.println("El número no está en el rango permitido.");
        } else {
            // Verificar cuántas cifras tiene el número
            if (num < 10) {
                System.out.println("El número tiene 1 cifra.");
            } else if (num < 100) {
                System.out.println("El número tiene 2 cifras.");
            } else if (num < 1000) {
                System.out.println("El número tiene 3 cifras.");
            } else if (num < 10000) {
                System.out.println("El número tiene 4 cifras.");
            } else {
                System.out.println("El número tiene 5 cifras.");
            }
        }
		
		reader.close();

	}

}
