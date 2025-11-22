package engse204;

import java.util.Scanner;

public class mune {

	public static void main(String[] rgs) {
		Scanner ac=new Scanner(System.in);
		
		int num=ac.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Americano");
			break;
		case 2:
			System.out.println("Latte");
			break;
		case 3:
			System.out.println("Espresso");
			break;
		case 4:
			System.out.println("Mocha");
			break;
		default:
			System.out.println("Invalid Menu");
			break;
		
		}

	}

}
