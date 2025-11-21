package engse204;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		int num=ac.nextInt();
		
		if(num % 2 == 0) {
			System.out.println( "Even" ) ;
		} else {
			System.out.println( "Odd" ) ;
		}
	}

}
