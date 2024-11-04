package english;

import java.util.*;

public class Ejer6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int lastNum = 0;

		int num;
		
		int positiveJumps = 0;
		
		int negativeJumps = 0;
		
		System.out.print("Type the height of the new altitude mario will jump: ");
		num = reader.nextInt();
		
		while (num > -1) {
			if (num > lastNum)
				positiveJumps++;
			else if (num < lastNum)
				negativeJumps++;
			
			lastNum = num;
			
			System.out.print("Type another height: ");
			num = reader.nextInt();
		}
		
		System.out.print(positiveJumps + " " + negativeJumps);
		
		reader.close();
	}

}
