package boletincondicionales;

import java.util.*;

public class Ejer8 {

	public static void main(String[] args) {
		/* En este programa, mediante un switch y una operación para saber
		 * si el año es bisiesto o no, podré indicarle al usuario los días
		 * que tiene el mes que ha introducido. */
		
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		int ano;
		int mes;
		int dias;
		boolean bisiesto;
		
		// Le solicitamos al usuario el número del mes (1 - 12)
		System.out.print("Introduce el número del mes: ");
		mes = reader.nextInt();
		
		// Comprobamos si el mes introducido es correcto
		if (mes > 12 || mes < 1) {
			System.out.println("No has introducido un mes correcto.");
		} else { // En el caso de que sea correcto, le pedimos el año
			System.out.print("Introduce el número del año: ");
			ano = reader.nextInt();
			
			/* Comprobamos si el año introducido en bisiesto. Esto nos servirá
			 * para indicar que febrero tiene 29 días en vez de 28 los años
			 * bisiestos */
			bisiesto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
			
			// Switch con los días de cada mes
			switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
				dias = 31;
			}
			
			case 4, 6, 9, 11 -> {
				dias = 30;
			}
			
			// If para decidir si febrero (el mes 2) tiene 28 o 29 días
			case 2 -> {
				if (bisiesto) {
	                dias = 29;
	            } else {
	                dias = 28;
	            }
			}
			
			// Por defecto, un mes tendrá 0 días (para evitar problemas de variables no inicializadas)
			default -> {
				dias = 0;
			}
			}
			
			// Mensaje final para indicarle los días del mes al usuario
			System.out.print("El mes " + mes + " del año " + ano + " tiene " + dias + " días.");
		}
		
		reader.close();

	}

}
