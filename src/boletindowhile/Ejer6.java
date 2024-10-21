package boletindowhile;

import java.util.*;

public class Ejer6 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		String inputJugador1;
		String inputJugador2;
		
		do {
			do {
			System.out.print("Jugador 1, introduce tu opción: ");
			inputJugador1 = reader.next();
			} while (!(inputJugador1.equals("PIEDRA") || inputJugador1.equals("PAPEL") || inputJugador1.equals("TIJERAS")));
			
			do {
				System.out.print("Jugador 2, introduce tu opción: ");
				inputJugador2 = reader.next();
			} while (!(inputJugador2.equals("PIEDRA") || inputJugador2.equals("PAPEL") || inputJugador2.equals("TIJERAS")));
			
			if (inputJugador1.equals(inputJugador2)) {
				System.out.print("Empate.");
			} else if ((inputJugador1.equals("PIEDRA") && inputJugador2.equals("TIJERAS")) || (inputJugador1.equals("PAPEL") && inputJugador2.equals("PIEDRA")) || (inputJugador1.equals("TIJERAS") && inputJugador2.equals("PAPEL"))) {
				System.out.print("Jugador 1 ha ganado.");
			} else {
				System.out.print("Jugador 2 ha ganado.");
			}
			
			System.out.print("\nJugador 1, ¿quieres seguir jugando? (S): ");
			inputJugador1 = reader.next();
			
			System.out.print("\nJugador 2, ¿quieres seguir jugando? (S): ");
			inputJugador2 = reader.next();
			
			
		} while (inputJugador1.equals("S") && inputJugador2.equals("S"));
		
		System.out.print("\nHa finalizado el juego.");
		
		reader.close();

	}

}
