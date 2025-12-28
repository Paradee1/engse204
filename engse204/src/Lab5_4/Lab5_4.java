package Lab5_4;

import java.util.Scanner;

public class Lab5_4 {

	public static void main(String[] args) {
		Scanner df = new Scanner(System.in);
		
		// รับสี และ จำนวนล้อ
		String Color = df.nextLine();
		int Wheels = df.nextInt();
		
		Car car = new Car(Color, Wheels);
		car.displayDetails();
		
		df.close();

	}

}

//Superclass/Parent
class Vehicle {
	
	// Attributes
	protected String color;
	
	// Methods
	public Vehicle(String color) {
		this.color = color;
	}
}

//Subclass/Child
class Car extends Vehicle {
	
	// Attributes
	protected int wheels;
	
	// Constructor
	public Car(String color, int wheels) {
		super(color);
		this.wheels = wheels;
	}
	
	// Methods
	public void displayDetails() {
		System.out.print("Color:" + color);
		System.out.print(", Wheels:" + wheels);
	}
}