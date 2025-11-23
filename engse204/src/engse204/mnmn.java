package engse204;

import java.util.Scanner;

public class mnmn { //แก้1.7

	public static void main(String[] rgs) {
		Scanner am=new Scanner(System.in);
		
		int n=am.nextInt();
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			int num=am.nextInt();
			sum +=num;
		}
		System.out.println(sum);
		
	}

}
