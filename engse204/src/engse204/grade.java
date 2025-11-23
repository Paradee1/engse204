package engse204;

import java.util.Scanner;

public class grade {

	public static void main(String[] rgs) {
		Scanner cs = new Scanner(System.in);
		
		System.out.print("Input Score = ");
		int score=cs.nextInt();
		
		if(score >= 80){
			System.out.println("A");
		}
		else if(score >= 70){
			System.out.println("B");
		}
		else if(score >= 60) {
			System.out.println("C");
		}
		else if(score >= 50) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
