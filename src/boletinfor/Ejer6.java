package boletinfor;

import java.util.*;

public class Ejer6 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de la variable nota
		int nota;
		
		// Variable suspensos para guardar la cantidad de suspensos
		int suspensos = 0;
		
		/* String para mostrar el mensaje final diferenciando el plural y singular
		 * dependiendo de la cantidad de suspensos */
		String mensajeFinal = "X";
		
		// For que empieza por 0 y termina una vez i sea mayor o igual que 5, sumando 1 por cada vuelta
		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce una nota: "); // Pedimos una nota
			nota = reader.nextInt();
			
			if (nota < 5) // Si la nota es menor de 5, subimos el contador de suspensos
				suspensos++;
		}
		
		if (suspensos == 1) { // Si hay un suspenso, se imprime 1 suspenso
			mensajeFinal = 1 + " suspenso";
		} else { // Si hay varios o 0, se imprime X suspensos
			mensajeFinal = suspensos + " suspensos";
		}
		
		System.out.print("Hay " + mensajeFinal + ".");

		reader.close();
	}

}
