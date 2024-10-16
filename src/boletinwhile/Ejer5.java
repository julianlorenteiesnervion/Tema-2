package boletinwhile;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		/* Contador para ir sumando un alumno
		 * por cada vuelta del while */ 
		int contador = 0;
		
		// Guardar la última edad introducida
		int edadIntroducida = 0;
		
		// Suma total de todas las edades
		int sumaEdades = 0;
		
		// Media de las edades introducidas
		double mediaEdades;
		
		// Contador de todos los alumnos mayores de edad
		int contadorAlumnosMayores = 0;
		
		// Le solicitamos una edad al usuario
		System.out.print("Introduce una edad: ");
		edadIntroducida = reader.nextInt();
		
		/* While en el que, si la edad introducida es mayor o igual que 0,
		 * se le pedirá otra edad al usuario hasta que el usuario
		 * introduzca un número negativo */
		while (edadIntroducida >= 0) {
			// Añadimos un uno al contador
			contador++;
			
			// Añadimos esa edad a la suma total de edades
			sumaEdades += edadIntroducida;
			
			/* En caso de que sea mayor de edad, actualizamos
			el contador de mayores de edad */
			if (edadIntroducida >= 18)
				contadorAlumnosMayores++;
			
			// Le solicitamos otra edad al usuario
			System.out.print("Introduce otra edad: ");
			edadIntroducida = reader.nextInt();
		}
		
		// Calculamos la media de todas las edades
		mediaEdades = (double) sumaEdades / contador;
		
		// Mensaje final al usuario para mostrarle los datos solicitados
		System.out.print("La suma de todas las edades es: " + sumaEdades + "\n"
				+ "La media de todas las edades es: " + mediaEdades + "\n"
						+ "El número de alumnos es: " + contador + "\n"
								+ "La cantidad de mayores de edad es: " + contadorAlumnosMayores);
		
		reader.close();
	}

}
