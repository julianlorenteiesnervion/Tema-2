package boletinswitch;

import java.util.*;

public class Ejer2 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de la variable para el número de la semana
		int numSemana;
		
		/* Solicitamos al usuario el día de la semana,
		que nos lo introducirá mediante números */
		System.out.print("Lunes (1)\nMartes (2)\nMiércoles (3)\nJueves (4)\nViernes (5)\nSábado (6)\nDomingo (7)"
				+ "\nIntroduce un día de la semana: ");
		numSemana = reader.nextInt();
		
		// Switch para mostrarle al usuario el día de la semana
		switch (numSemana) {
		case 1 -> {
			System.out.println("El día introducido ha sido el Lunes.");
		}
		case 2 -> {
			System.out.println("El día introducido ha sido el Martes.");
		}
		case 3 -> {
			System.out.println("El día introducido ha sido el Miércoles.");
		}
		case 4 -> {
			System.out.println("El día introducido ha sido el Jueves.");
		}
		case 5 -> {
			System.out.println("El día introducido ha sido el Viernes.");
		}
		case 6 -> {
			System.out.println("El día introducido ha sido el Sábado.");
		}
		case 7 -> {
			System.out.println("El día introducido ha sido el Domingo.");
		}
		default -> {
			System.out.print("No has introducido un número comprendido entre el 1 y el 7.");
		}
		}
		
		reader.close();

	}

}
