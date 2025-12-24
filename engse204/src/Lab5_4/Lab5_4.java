package Lab5_4;

import java.util.Scanner;

public class Lab5_4 {

	public static void main(String[] args) {
		Scanner df = new Scanner(System.in);
		
		String Color = df.nextLine();
		int Wheels = df.nextInt();
		
		Car car = new Car(Color, Wheels);
		car.displayDetails();
		
		df.close();

	}

}

class Vehicle {
	protected String color;
	
	public Vehicle(String color) {
		this.color = color;
	}
}

class Car extends Vehicle {
	protected int wheels;
	
	public Car(String color, int wheels) {
		super(color);
		this.wheels = wheels;
	}
	
	public void displayDetails() {
		System.out.println("Color:" + color + ", Wheels:" + wheels);
	}
}