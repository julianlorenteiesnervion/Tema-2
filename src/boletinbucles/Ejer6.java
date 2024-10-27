package boletinbucles;

import java.util.*;

public class Ejer6 {

    public static void main(String[] args) {
    	/* IMPORTANTE: Si estás viendo esto, me gustaría que me dieras sugerencias
    	 * sobre cómo hacer este código de una manera aún más sencilla, ya que
    	 * seguramente es posible realizar lo mismo con una menor cantidad de variables
    	 * y operaciones. */
    	
        // Creación del Scanner
        Scanner reader = new Scanner(System.in);
        
        // Variable num para guardar en ella el número introducido por el usuario
        int num;
        
        /* Variable "k" que usaré para imprimir por pantalla la cantidad de asteriscos
         * que sean necesarios en esa línea. También la usaré para igualarla al contador
         * antes del for para así poder ir imprimiendo un asterisco más por cada vuelta */
        int k;
        
        // Solicitamos al usuario el número
        System.out.print("Introduce un número: ");
        num = reader.nextInt();
        
        // Guardo el número menos uno en k (luego se verá por qué)
        k = num - 1;
        
        /* For en el que inicializamos la variable i con el valor del número introducido por
         * el usuario. Guardo el número en la variable i que usaremos como contador para que el
         * for deje de dar vueltas una vez este contador se haya acabado, por eso,
         * el contador será el mismo número que el número introducido ya que queremos dar
         * las mismas vueltas que el usuario nos solicitó */
        for (int i = num; i > 0; i--) {
        	/* For que uso para imprimir los espacios iniciales que van antes del primer
        	 * asterisco. Tenemos que imprimir al principio el mismo número de espacios
        	 * que el número introducido por el usuario menos 1. Un ejemplo:
        	 *    a
        	 *   a a
        	 *  a a a
        	 * Como podemos ver, si el usuario nos ha pedido que le imprimamos 3 líneas de altura
        	 * de la pirámide. Si nos fijamos en la primera línea, a la izquierda de la a hay sólo
        	 * dos espacios, es por eso que para imprimir esa cantidad de espacios simplemente
        	 * tenemos que restarle 1 al número introducido por el usuario.
        	 * 
        	 *  Este bucle se finalizará una vez ese espacio se haya imprimido las veces necesarias,
        	 *  es decir, una vez el contador j llegue a 0. Por cada vuelta, imprimimos un espacio
        	 *  y le restamos una unidad a j */
            for (int j = i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            
            /* Una vez hemos terminado de imprimir los espacios que van a la izquierda del
             * primer asterisco de la línea, imprimimos el asterisco */
            System.out.print("*");
            
            // Igualamos la variable k (que usaremos en el siguiente for) a la variable i
            k = i;
            
            /* For para imprimir los siguientes asteriscos al primer asterisco de la línea.
             * Ahora que tenemos la variable k igualada a la variable i, imprimiremos asteriscos
             * hasta que la variable k sea igual al número introducido por el usuario ya que
             * le sumaremos un uno más a la variable k por cada vuelta, de forma que,
             * si por ejemplo vamos a imprimir la segunda fila, la variable k valdrá i - 1,
             * así que este bucle se repetirá 1 vez ya que al completar la primera vuelta,
             * k pasará a valer lo mismo que el número introducido por el usuario y ya no se darán
             * más vueltas, imprimiendo así un sólo asterisco */
            for (; k < num; k++) {
			System.out.print(" *");
			}
            
            // Salto de línea una vez hemos terminado de imprimir todos los asteriscos
            System.out.print("\n");
            
        }
        
        reader.close();

    }

}