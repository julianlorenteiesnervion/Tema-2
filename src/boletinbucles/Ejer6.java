package boletinbucles;

import java.util.*;

public class Ejer6 {

    public static void main(String[] args) {
        // Creación del Scanner
        Scanner reader = new Scanner(System.in);
        
        int num;
        
        int k;
        
        int contador;
        
        System.out.print("Introduce un número: ");
        num = reader.nextInt();
        k = num - 1;
        contador = num;
        
        for (int i = num; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            
            k = contador;
            while (k < num) {
                System.out.print(" *");
                k++;
            }
            
            // ¿Por qué no funciona con este for?
            /* for (; k < num; k++) {
			System.out.println(" *");
			} */
            
            contador--;
            System.out.print("\n");
            
        }
        
        reader.close();

    }

}