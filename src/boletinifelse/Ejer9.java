package boletinifelse;

import java.util.*;

public class Ejer9 {

	public static void main(String[] args) {
		// Creación Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		int jugador1;
		int jugador2;
		
		// Solicitar a los jugadores el objeto que van a usar
		System.out.println("Bienvenidos, elegid vuestro objeto.");
		System.out.println("PIEDRA (1)");
        System.out.println("PAPEL (2)");
        System.out.println("TIJERA (3)");
        
        // Jugador 1 elige su objeto
        System.out.print("Jugador 1, introduce tu objeto (1, 2 o 3): ");
        jugador1 = reader.nextInt();

        // Jugador 2 elige su objeto
        System.out.print("Jugador 2, introduce tu objeto (1, 2 o 3): ");
        jugador2 = reader.nextInt();
		
        
        // Operaciones para verificar si los objetos introducidos son correctos
		if ((jugador1 < 1 || jugador1 > 3) || (jugador2 < 1 || jugador2 > 3)) {
            System.out.println("Objetos inválidos. Deben ser 1, 2 o 3.");
        } else {
            // Determinar el ganador o empate
            if (jugador1 == jugador2) {
                System.out.println("Empate.");
            } else if ((jugador1 == 1 && jugador2 == 3) || (jugador1 == 2 && jugador2 == 1) || (jugador1 == 3 && jugador2 == 2)) {
                System.out.println("Jugador 1 gana.");
            } else {
                System.out.println("Jugador 2 gana.");
            }
        }
		
		reader.close();

	}

}
