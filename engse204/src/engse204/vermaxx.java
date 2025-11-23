package engse204;

import java.util.Scanner;

public class vermaxx {

	public static void main(String[] rgs) {
		Scanner mx=new Scanner(System.in);
		
		int n=mx.nextInt();
		
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			int num=mx.nextInt();
			
			if(num>sum) {
				sum = num;
			}
		}
		System.out.println(sum);
	}

}
