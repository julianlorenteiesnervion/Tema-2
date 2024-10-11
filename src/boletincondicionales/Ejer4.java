package boletincondicionales;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
    	/* En este programa, solicitamos al usuario un número comprendido
    	 * entre 1 y 99 para luego devolverle el número en letras. Lo que he hecho
    	 * es (con switches) devolverle el número uno, dos, tres... si el número
    	 * introducido está entre el 1 y el 9. Luego, desde el 10 hasta el 19 tenemos
    	 * números especiales ya que no podemos poner "diez y siete", por lo que esos
    	 * los he definido por separado. Por último, si es mayor o igual de 20, separo
    	 * la decena de la unidad e imprimo la decena, por ejemplo, treinta. Si la unidad
    	 * es distinta de 0, se le añadirá después de la decena el número correspondiente,
    	 * por ejemplo " y dos", de forma que quedaría "treinta" + " y dos". */
    	
        // Creación del Scanner
        Scanner reader = new Scanner(System.in);
        
        // Declaración de variables
        int num;
        int decena = 0; // Inicializado por si el número es menor a 20
        int unidad = 0; // Inicializado por si el número es menor a 10
        String resultado = "X";
        
        // Solicitamos al usuario el número y lo guardamos en la variable num
        System.out.print("Introduce un número entero entre 1 y 99: ");
        num = reader.nextInt();

        if (num < 1 || num > 99) {
            System.out.println("Número fuera de rango. Debe estar entre 1 y 99.");
        } else {
            // Operaciones para convertir el número a letras
            if (num < 10) {
                switch (num) {
                    case 1 -> {
                        resultado = "uno";
                    }
                    case 2 -> {
                        resultado = "dos";
                    }
                    case 3 -> {
                        resultado = "tres";
                    }
                    case 4 -> {
                        resultado = "cuatro";
                    }
                    case 5 -> {
                        resultado = "cinco";
                    }
                    case 6 -> {
                        resultado = "seis";
                    }
                    case 7 -> {
                        resultado = "siete";
                    }
                    case 8 -> {
                        resultado = "ocho";
                    }
                    case 9 -> {
                        resultado = "nueve";
                    }
                }
            } else if (num < 20) {
                switch (num) {
                    case 10 -> {
                        resultado = "diez";
                    }
                    case 11 -> {
                        resultado = "once";
                    }
                    case 12 -> {
                        resultado = "doce";
                    }
                    case 13 -> {
                        resultado = "trece";
                    }
                    case 14 -> {
                        resultado = "catorce";
                    }
                    case 15 -> {
                        resultado = "quince";
                    }
                    case 16 -> {
                        resultado = "dieciséis";
                    }
                    case 17 -> {
                        resultado = "diecisiete";
                    }
                    case 18 -> {
                        resultado = "dieciocho";
                    }
                    case 19 -> {
                        resultado = "diecinueve";
                    }
                }
            } else {
                decena = num / 10; // Calcular la decena
                unidad = num % 10; // Calcular la unidad

                // Decenas
                switch (decena) {
                    case 2 -> {
                        resultado = "veinte";
                    }
                    case 3 -> {
                        resultado = "treinta";
                    }
                    case 4 -> {
                        resultado = "cuarenta";
                    }
                    case 5 -> {
                        resultado = "cincuenta";
                    }
                    case 6 -> {
                        resultado = "sesenta";
                    }
                    case 7 -> {
                        resultado = "setenta";
                    }
                    case 8 -> {
                        resultado = "ochenta";
                    }
                    case 9 -> {
                        resultado = "noventa";
                    }
                }

                // Añadir la unidad si no es cero
                if (unidad != 0) {
                    switch (unidad) {
                        case 1 -> {
                            resultado = resultado + " y uno";
                        }
                        case 2 -> {
                        	resultado = resultado + " y dos";
                        }
                        case 3 -> {
                        	resultado = resultado + " y tres";
                        }
                        case 4 -> {
                        	resultado = resultado + " y cuatro";
                        }
                        case 5 -> {
                        	resultado = resultado + " y cinco";
                        }
                        case 6 -> {
                        	resultado = resultado + " y seis";
                        }
                        case 7 -> {
                        	resultado = resultado + " y siete";
                        }
                        case 8 -> {
                        	resultado = resultado + " y ocho";
                        }
                        case 9 -> {
                        	resultado = resultado + " y nueve";
                        }
                    }
                }
            }

            System.out.println("El número " + num + " en letras es " + resultado);
        }

        reader.close();
    }
}
