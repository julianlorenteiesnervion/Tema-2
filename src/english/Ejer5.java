package english;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		//
		Scanner reader = new Scanner(System.in);
		
		int velocity = 0;
		
		int time = 0;
		
		int displacement = 0;
		
		double result = 0;
		
		String dataType;
		String dataType2;
		
		System.out.print("Type the type of data: ");
		dataType = reader.next();
		
		switch (dataType) {
		case "V" -> {
			System.out.print("Type the velocity: ");
			velocity = reader.nextInt();
		}
		case "T" -> {
			System.out.print("Type the time: ");
			time = reader.nextInt();
		}
		case "D" -> {
			System.out.print("Type the displacement: ");
			displacement = reader.nextInt();
		}
		}
		
		do {
		System.out.print("Type another type of data: ");
		dataType2 = reader.next();
		} while (dataType.equals(dataType2));
		
		switch (dataType2) {
		case "V" -> {
			System.out.print("Type the velocity: ");
			velocity = reader.nextInt();
		}
		case "T" -> {
			System.out.print("Type the time: ");
			time = reader.nextInt();
		}
		case "D" -> {
			System.out.print("Type the displacement: ");
			displacement = reader.nextInt();
		}
		}
		
		if (dataType.equals("V") && dataType2.equals("T") || dataType.equals("T") && dataType2.equals("V")) {
			result = (double) velocity * time;
		} else if (dataType.equals("V") && dataType2.equals("D") || dataType.equals("D") && dataType2.equals("V")) {
			result = (double) displacement / velocity;
		} else {
			result = (double) displacement / time;
		}
		
		System.out.print(result);
		
		
		
		

	}

}
