package engse204;

import java.util.Scanner;

public class eve {

	public static void main(String[] rgs) {
		Scanner ve=new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int number=ve.nextInt();
		
		if(number%2 == 0) {
			System.out.println( "Even" );
		}
		else {
			System.out.println( "Odd" );
		}

	}

}
