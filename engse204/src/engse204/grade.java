package engse204;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Score = ");
		int score=sc.nextInt();
		
		if(score >= 80){
			System.out.println("A");
		}
		if(score >= 70&&score <= 79){
			System.out.println("B");
		}
		if(score >= 60&&score <= 69) {
			System.out.println("C");
		}
		if(score >= 50&&score <= 59) {
			System.out.println("D");
		}
		if(score <= 49) {
			System.out.println("F");
		}
	}

}
