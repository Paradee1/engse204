package Lab5_5;

import java.util.Scanner;

public class Lab5_5 {

	public static void main(String[] args) {
		Scanner qw = new Scanner(System.in);
		
		// รับInputสำหรับ Circle
		double Radius = qw.nextDouble();
		
		// รับInputสำหรับ Rectangle
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

//Superclass/Parent
class Shape {
	
	// Attributes
	protected String name;
	
	// Constructor
	public Shape(String name) {
		this.name = name;
	}
	
	// Methods
	public double calculateArea() {
		return 0.0;
	}
}

//Subclass/Child
class Circle extends Shape {
	
	// Attributes
	protected double radius;
	
	// Constructor
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	// Methods
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