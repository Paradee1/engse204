package engse204;

import java.util.Scanner;

public class menunum {

	public static void main(String[] args) {
		Scanner mn = new Scanner(System.in);
		System.out.print("Input Number = ");
		int num=mn.nextInt();
		
		if(num == 1) {
			System.out.println("Americano");
		}
		else if(num == 2) {
			System.out.println("Latte");
		}
		else if(num == 3) {
			System.out.println("Espresso");
		}
		else if(num == 4) {
			System.out.println("Mocha");
		}
		else {
			System.out.println("Invalid Menu");
		}
	}

}
