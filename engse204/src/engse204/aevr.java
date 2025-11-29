package engse204;

import java.util.Scanner;

public class aevr { 

	public static void main(String[] rgs) {
		Scanner ar=new Scanner(System.in);
		
		double sum = 0;
		double ave = 0;
		
		int n=ar.nextInt();
		
		int[] data=new int[n];
		
		for(int i=0;i<n;i++) {
			data[i]=ar.nextInt();
			sum += data[i];
		}
		ave = sum / n ;
		System.out.println("Average = "+ave);
	}

}
