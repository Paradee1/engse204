package Lab2_5;

import java.util.Scanner;

public class Lab2_5 {

	public static void main(String[] rgs) {
		Scanner wh=new Scanner(System.in);
		
		System.out.print("Width:");
		double width=wh.nextDouble();
		System.out.print("Height:");
		double height=wh.nextDouble();
		
		Rectangle ap = new Rectangle(width, height);
		
		System.out.println("Area:"+ap.getArea());
		System.out.println("Perimeter:"+ap.getPerimeter());
	}

}

class Rectangle {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}
	
	public double getArea() {
		double area;
		area = width * height;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter;
		perimeter = 2 * (width + height);
		return perimeter;
	}
}
