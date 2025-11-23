package engse204;

import java.util.Scanner;

public class eve {

	public static void main(String[] args) {
		Scanner ve=new Scanner(System.in);
		
		int num=ve.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}

	}

}
