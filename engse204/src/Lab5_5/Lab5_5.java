package Lab5_5;

import java.util.Scanner;

public class Lab5_5 {

	public static void main(String[] args) {
		Scanner qw = new Scanner(System.in);
		
		double Radius = qw.nextDouble();
		double Width = qw.nextDouble();
		double Height = qw.nextDouble();
		
		Circle circle = new Circle("Circle",Radius);
		Rectangle rect = new Rectangle("Rectangle",Width, Height);
		
		Shape[] shapes = {circle, rect};
		
		for(Shape s : shapes) {
			System.out.println(s.name + " Area: " + s.calculateArea());
		}
		
		qw.close();
	}

}

class Shape {
	protected String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	public double calculateArea() {
		return 0.0;
	}
}

class Circle extends Shape {
	protected double radius;
	
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return 3.14159 * radius * radius;
	}
}

class Rectangle extends Shape{
	protected double width;
	protected double height;
	
	public Rectangle(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return width * height;
	}
}