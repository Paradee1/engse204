package engse204;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double width=sc.nextDouble();
		double height=sc.nextDouble();
		
		double area = width * height;
		
		System.out.println(area);
	}

}