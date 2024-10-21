package boletindowhile;

import java.util.*;

public class Ejer6 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de las variables inputJugador1 e inputJugador2 para guardar la cadena introducida por los jugadores
		String inputJugador1;
		String inputJugador2;
		
		// Do-while para que el programa se repita siempre que ambos jugadores introduzcan la letra "S"
		do {
			// Do-while para que el jugador introduzca sí o sí una opción correcta
			do {
			System.out.print("Jugador 1, introduce tu opción: ");
			inputJugador1 = reader.next();
			} while (!(inputJugador1.equals("PIEDRA") || inputJugador1.equals("PAPEL") || inputJugador1.equals("TIJERAS")));
			
			// Do-while para que el jugador introduzca sí o sí una opción correcta
			do {
				System.out.print("Jugador 2, introduce tu opción: ");
				inputJugador2 = reader.next();
			} while (!(inputJugador2.equals("PIEDRA") || inputJugador2.equals("PAPEL") || inputJugador2.equals("TIJERAS")));
			
			// If para realizar las operaciones del juego piedra-papel-tijeras
			if (inputJugador1.equals(inputJugador2)) { // Empates (que ambos hayan escogido la misma opción)
				System.out.print("Empate.");
			// Casos en los que gana el jugador 1
			} else if ((inputJugador1.equals("PIEDRA") && inputJugador2.equals("TIJERAS")) || (inputJugador1.equals("PAPEL") && inputJugador2.equals("PIEDRA")) || (inputJugador1.equals("TIJERAS") && inputJugador2.equals("PAPEL"))) {
				System.out.print("Jugador 1 ha ganado.");
			} else { // Si no se ha empatado ni tampoco ha ganado el jugador 1, se decidirá que el ganador es el jugador 2
				System.out.print("Jugador 2 ha ganado.");
			}
			
			// Preguntamos a ambos jugadores si quieren seguir jugando
			System.out.print("\nJugador 1, ¿quieres seguir jugando? (S): ");
			inputJugador1 = reader.next();
			
			System.out.print("\nJugador 2, ¿quieres seguir jugando? (S): ");
			inputJugador2 = reader.next();
			
		// El bucle se repetirá si ambos jugadores decidieron volver a jugar	
		} while (inputJugador1.equals("S") && inputJugador2.equals("S"));
		
		// Mensaje de finalización del juego
		System.out.print("\nHa finalizado el juego.");
		
		reader.close();

	}

}
