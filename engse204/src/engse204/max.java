package engse204;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		
		int sum = 0;
		
		int n=ac.nextInt();
		for(int i = 0 ; i < n ; i++) {
			int num=ac.nextInt();
			
			if(num>sum) {
				sum = num;
			}
		}
		System.out.println(sum);

	}

}
