package engse204;

import java.util.Scanner;

public class mnmn { 

	public static void main(String[] rgs) {
		Scanner am=new Scanner(System.in);
		
		int n=am.nextInt();
		
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			int number=am.nextInt();
			sum +=number;
		}
		System.out.println(sum);
		
	}

}
