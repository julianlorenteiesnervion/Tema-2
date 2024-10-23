package boletinfor;

public class Ejer4 {

	public static void main(String[] args) {
		// Declaramos la variable impar para actualizar y mostrar los números impares
		int impar = 1;
		
		/* For en el que, empezamos con 1, continuamos mientras i sea menor
		 * o igual que 10 para así dar 10 vueltas y sumamos un 1 cada vuelta */
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "º = " + impar); // Imprimimos el número impar
			
			impar += 2; // Le sumamos 2 al número impar
		}

	}

}
