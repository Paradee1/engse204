package engse204;

import java.util.Scanner;

public class ari {
	
	public static void main(String[] rgs) {
		Scanner ea=new Scanner(System.in);
		
		double x=ea.nextDouble();
		double y=ea.nextDouble();
		
		double area=calculateArea(x,y);
		
		System.out.println(area);
		
	}

	static double calculateArea(double width, double height) {
		return width * height;
	}
}
