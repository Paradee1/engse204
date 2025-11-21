package engse204;

import java.util.Scanner;

public class mul {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		int num=ab.nextInt();
		
		for(int i = 1 ; i <= 12 ; i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}

	}

}
