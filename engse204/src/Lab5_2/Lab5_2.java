package Lab5_2;

import java.util.Scanner;

public class Lab5_2 {

	public static void main(String[] args) {
		Scanner df = new Scanner(System.in);
		
		// รับชื่อ,อายุ
		String Name = df.nextLine();
		int Age = df.nextInt();
		
		Cat cat = new Cat(Name, Age);
		cat.displayInfo();
		cat.makeSound();

		df.close();
	}

}

// Superclass
class Animal {
	
	// Attributes
	protected String name;
	protected int age;
	
	// Methods
	public void makeSound() {
		System.out.println("I am a Animal.");
	}
	
	public void displayInfo() {
		System.out.print("Name:" + name);
		System.out.println(", Age:" + age);
	}
}

//Subclass/Child
class Cat extends Animal {
	
	// Constructor
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Methods
	@Override
	public void makeSound() {
		System.out.println("Meow!");
	}
}