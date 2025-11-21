package engse204;

import java.util.Scanner;

public class n {

	public static void main(String[] args) {
		Scanner nm=new Scanner(System.in);
		
		int sum = 0;
		int n=nm.nextInt();
		
		for(int i=0;i<n;i++) {
			int num=nm.nextInt();
			sum +=num;
		}
		System.out.println(sum);
		
	}

}
