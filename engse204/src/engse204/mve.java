package engse204;

import java.util.Scanner;

public class mve { 

	public static void main(String[] rgs) {
		Scanner ml=new Scanner(System.in);
		
		int num=ml.nextInt();
		
		int i = 1;
		while (i <= 12) {
		    System.out.println(num+" x "+i+" = "+(num*i));
		    i++;
		}

	}

}
