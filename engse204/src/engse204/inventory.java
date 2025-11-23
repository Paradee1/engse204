package engse204;

import java.util.Scanner;

public class inventory {

	public static void main(String[] rgs) {
		Scanner nv=new Scanner(System.in);
				
		int n=nv.nextInt();
		
		int[] productID=new int[n];
		int[] Stock=new int[n];
		
		for(int i=0;i<n;i++) {
			productID[i]=nv.nextInt();
			Stock[i]=nv.nextInt();
		}
		
		int SearchID=nv.nextInt();
		
		boolean check = false;
		for(int a=0;a<n;a++) {
			if(SearchID == productID[a]) {
				System.out.println(Stock[a]);
				check = true;
				break;
			}
		}
		
		if(!check) {
			System.out.println("Product "+SearchID+" not found");
		}
		
	}

}
