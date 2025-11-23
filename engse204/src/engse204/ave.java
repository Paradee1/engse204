package engse204;

import java.util.Scanner;

public class ave {

	public static void main(String[] args) {
		Scanner na=new Scanner(System.in);
		
		double sum = 0;
		double ave = 0;
		
		int n=na.nextInt();
		for(int i = 0 ; i < n ; i++) {
			int num=na.nextInt();
				sum += num;
		}
		ave = sum / n;
		System.out.println("Average = "+ave);
	}

}