package boletinbucles;

import java.util.*;

public class Ejer9 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Variable numIntroducido en la que guardo el número introducido por el usuario
		int numIntroducido;
		
		/* Variable num para guardar también el número introducido por el usuario pero
		 * que usaré para las operaciones, de forma que su valor irá variando */
		int num;
		
		// Variable cifras para guardar la cantidad de cifras del número introducido por el usuario
		int cifras = 0;
		
		/* Solicitamos al usuario el número, de forma que con un do-while le
		 * obligaremos a que introduzca un número mayor que 0 */
		do {
			System.out.print("Introduce un número mayor que 0: ");
			numIntroducido = reader.nextInt();
			num = numIntroducido;
		} while (num <= 0);
	
		/* Do while en el que, por cada vuelta, aumentaremos una unidad en el contador de cifras
		 * y dividiremos el número introducido entre 10, de forma que el bucle finalizará una vez
		 * esa división resulte en un cociente menor que 0. Al hacer esto, podremos saber la cantidad
		 * de cifras del número ya que se suma una por cada vuelta */
		do {
			cifras++;
			num /= 10;
		} while (num > 0);
		
		/* Mensaje final al usuario con la cantidad de cifras del número introducido,
		 * con un operador ternario para imprimir "cifras" en vez de "cifra" si el
		 * número de cifras es mayor que 1 */
		System.out.print("El número " + numIntroducido + " tiene " + cifras + (cifras > 1 ? " cifras.": " cifra."));
		
		reader.close();

	}

}
