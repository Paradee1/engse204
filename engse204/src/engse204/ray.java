package engse204;

import java.util.Scanner;

public class ray {

	public static void main(String[] rgs) {
		
		Scanner ar=new Scanner(System.in);
		
		int n=ar.nextInt();
		
		int[] num = new int[n];   
		
		for(int i=0;i<n;i++) {
			num[i]=ar.nextInt();
		}
		
		int arr=sumArray(num);
		
		System.out.println(arr);
		
	}
	static int sumArray(int[] number) {
		int sum = 0;
		for(int a=0;a<number.length;a++) {
			sum += number[a];
		}
		return sum;
	}

}
