package boletincondicionales;

import java.util.*;

public class Ejer7 {

	public static void main(String[] args) {
		/* En este programa hago uso de una simple operación
		 * y un operador ternario para calcular el precio de un billete
		 * de tren, del cual su precio será variable en caso de que
		 * se cumplan ciertas condiciones. */
		
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de las variables y constantes
		final double PRECIO_KM = 2.5;
		int distancia;
		int diasEstancia;
		double precioBillete;
		
		/* Solicitamos al usuario la distancia recorrida
		   y los días de estancia */
		System.out.print("¿Qué distancia recorrerá el tren? (en km): ");
		distancia = reader.nextInt();
		
		System.out.print("¿Cuántos días te quedarás?: ");
		diasEstancia = reader.nextInt();
		
		// Multiplicación de la distancia en km por el precio / km
		precioBillete = distancia * PRECIO_KM;
		
		/* Ternario para reducir el precio del billete en un 30% en caso de
		   de que sea un viaje de más de 800 km de distancia o más de 7 días
		   de estancia */
		System.out.println(diasEstancia > 7 && distancia > 800 ? "El precio del billete "
				+ "es de " + precioBillete * 0.7 + "€." : "El precio del billete es "
						+ "de " + precioBillete + "€.");
		
		reader.close();

	}

}
