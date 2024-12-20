package boletinbucles;

import java.util.*;

public class Ejer1 {

	public static void main(String[] args) {
		/* En este programa, le pregunto al usuario qué hora es o qué hora
		 * quiere introducir, y mediante unas cuantas operaciones le calcularé
		 * esa hora dentro de los segundos que él también introducirá, teniendo
		 * en cuenta todos los casos que pueden ocurrir, como el cambio de día,
		 * de hora o de minuto. */
		
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);

        // Declaración de las variables para las horas, minutos y segundos
		int hora;
		int mins;
		int secs;
		
		// Variable secsSuma para guardar los segundos a sumar a la hora introducida
		int secsSuma;
		
		// Preguntamos al usuario por las horas, minutos y segundos de una hora del día
		System.out.print("Introduce las horas: ");
		hora = reader.nextInt();
		
		System.out.print("Introduce los minutos: ");
		mins = reader.nextInt();
		
		System.out.print("Introduce los segundos: ");
		secs = reader.nextInt();
		
		System.out.print("Introduce los segundos a sumar: ");
		secsSuma = reader.nextInt();
		
		// En caso de que haya introducido una hora incorrecta, se le informará
		if (hora > 23 || mins > 59 || secs > 59 || hora < 0 || mins < 0 || secs < 0) {
			System.out.print("No has introducido un formato de hora correcto.");
		} else {
			/* Damos vueltas al for hasta que se hayan dado las mismas vueltas
			 * como segundos introducidos a incrementar */
			for (int i = 0; i < secsSuma; i++) {
			// Le sumamos un segundo a la hora introducida
			++secs;
			
			/* Si los segundos después de la operación son 60, se sumará un minuto
			   y se restaurará los segundos a 0 */
			if (secs == 60) {
				++mins;
				secs = 0;
			}
			
			/* Si los minutos después de la operación son 60, se sumará una hora
			   y se restaurará los minutos a 0 */
			if (mins == 60) {
				++hora;
				mins = 0;
			}
			
			/* En el caso de las horas, si da 24 después de la operación, se dará por completo
			 * el día, pasando al día siguiente y por lo tanto restaurando la hora a 0 */
			if (hora == 24) {
				hora = 0;
			}
			}
			
			// Mensaje para el usuario con la hora introducida pero con los segundos incrementados
			System.out.print(hora + ":" + mins + ":" + secs);
		}
		
        reader.close();

	}

}
