package boletinfor;

public class Ejer4 {

	public static void main(String[] args) {
		// Declaramos la variable impar para actualizar y mostrar los números impares
		int impar = 1;
		
		// Variable para guardar la suma de los impares
		int sumaImpares = 1;
		
		/* For en el que, empezamos con 1, continuamos mientras i sea menor
		 * que 10 para así dar 10 vueltas y sumamos un 1 cada vuelta */
		for (int i = 1; i < 10; i++) {
			sumaImpares += impar += 2; // Le sumamos el número impar a la suma total de impares
		}
		
		System.out.println(sumaImpares);
		
	}

}
