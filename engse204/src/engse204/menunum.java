package engse204;

import java.util.Scanner;

public class menunum {

	public static void main(String[] args) {
		Scanner mn = new Scanner(System.in);
		
		System.out.print("Input Number = ");
		int num=mn.nextInt();
		
		switch (num) {
			case 1 :		
				System.out.println("Americano");
				break;
			case 2 :		
				System.out.println("Latte");
				break;
			case 3 :		
				System.out.println("Espresso");
				break;
			case 4 :		
				System.out.println("Mocha");
				break;
			default :
				System.out.println("Invalid Menu");
		}
	}

}
